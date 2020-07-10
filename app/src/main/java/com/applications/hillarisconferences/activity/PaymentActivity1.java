package com.applications.hillarisconferences.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.applications.hillarisconferences.R;
import com.applications.hillarisconferences.adapters.AddOnAdapter;
import com.applications.hillarisconferences.api.ApiInterface;
import com.applications.hillarisconferences.api.RetrofitClient;
import com.applications.hillarisconferences.listener.CatClickListener1;
import com.applications.hillarisconferences.models.AddOnItem;
import com.applications.hillarisconferences.models.Categories;
import com.applications.hillarisconferences.models.ConferenceProducts;
import com.google.gson.JsonObject;

import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PaymentActivity1 extends AppCompatActivity {
    ArrayList<String> spinnerList = new ArrayList<>();
    private static final String TAG = "RESPONSE_DATA";


    List<Categories> categoryTypeList = new ArrayList<>();
    List<ConferenceProducts.RegistrationProductsBean> registrationProductsBeans;
    @BindView(R.id.radio0)
    RadioButton radio0;
    @BindView(R.id.radio1)
    RadioButton radio1;
    @BindView(R.id.radio2)
    RadioButton radio2;
    @BindView(R.id.currency_group)
    RadioGroup currencyGroup;
    @BindView(R.id.spinnerCategory)
    Spinner spinnerCategory;
    @BindView(R.id.spinnerCategoryProduct)
    Spinner spinnerCategoryProduct;
    @BindView(R.id.txtDate1)
    TextView txtDate1;
    @BindView(R.id.txtDate2)
    TextView txtDate2;
    @BindView(R.id.txthide)
    TextView txthide;
    @BindView(R.id.txtPrice1)
    TextView txtPrice1;
    @BindView(R.id.txtPrice2)
    TextView txtPrice2;
    @BindView(R.id.textAdd1)
    CheckBox textAdd1;
    @BindView(R.id.itemChildLayout1)
    LinearLayout itemChildLayout1;
    @BindView(R.id.catCard)
    CardView catCard;
    @BindView(R.id.txtTotalPrice)
    TextView txtTotalPrice;
    @BindView(R.id.btnProceed)
    Button btnProceed;
    @BindView(R.id.bottamLayout)
    LinearLayout bottamLayout;
    @BindView(R.id.progressBar)
    LinearLayout progressBar;


    ApiInterface apiInterface;
    String currentDate, categoryType, currencyType;
    String conf_Id, userName, emailID, mobileNumber, country;
    //String  conf_Id="6036",title="dentist",userName="ANIL",emailID="anil@gmail.com",mobileNumber="123466",country="india";
    String catProduct_Id = "", catProduct = "";
    double totalCount = 0.00;
    int catPrice = 0, finalTotal = 0;
    String productType, actionTitle, shorttitle, conf_type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment1);
        ButterKnife.bind(this);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Choose Products");

        if (getIntent() != null) {
            conf_Id = getIntent().getStringExtra("id");
            actionTitle = getIntent().getStringExtra("title");
            shorttitle = getIntent().getStringExtra("shorttitle");
            conf_type = getIntent().getStringExtra("conf_type");
            userName = getIntent().getStringExtra("userName");
            mobileNumber = getIntent().getStringExtra("mobileNumber");
            emailID = getIntent().getStringExtra("emailID");
            country = getIntent().getStringExtra("country");
        }
        currentDate = new SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault()).format(new Date());


        currencyType = "\u00a3";
        getCategoriesType();
        getConferenceProducts(currencyType, "Academic");
        totalCount = catPrice;
        calculateCartTotal("", catProduct, catProduct_Id);

        currencyGroup.setOnCheckedChangeListener((group, checkedId) -> {

            Log.d(TAG, "onCheckedChanged: " + checkedId);
            // checkedId is the RadioButton selected
            switch (checkedId) {
                case R.id.radio0:
                    currencyType = "\u00a3";


                    getConferenceProducts(currencyType, "Academic");
                    getCategoriesType();
                    totalCount = catPrice;
                    calculateCartTotal("", catProduct, catProduct_Id);


                    break;

                case R.id.radio1:
                    // Do Something
                    currencyType = "\u20ac";


                    getConferenceProducts(currencyType, "Academic");
                    getCategoriesType();
                    totalCount = catPrice;
                    calculateCartTotal("", catProduct, catProduct_Id);
                    break;

                case R.id.radio2:
                    // Do Something
                    currencyType = "$";


                    getConferenceProducts(currencyType, "Academic");
                    getCategoriesType();
                    totalCount = catPrice;
                    calculateCartTotal("", catProduct, catProduct_Id);
                    break;
            }

        });


    }

    private void getCategoriesType() {
        progressBar.setVisibility(View.VISIBLE);

        apiInterface = RetrofitClient.getClient(this).create(ApiInterface.class);
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("conf_id", conf_Id);

        Log.d(TAG, "RESPONSE_ID" + jsonObject);

        apiInterface.processDataConferenceProducts(jsonObject).enqueue(new Callback<ConferenceProducts>() {
            @Override
            public void onResponse(@NotNull Call<ConferenceProducts> call, @NotNull Response<ConferenceProducts> response) {

                if (response.isSuccessful()) {

                    registrationProductsBeans = Objects.requireNonNull(response.body()).getRegistration_products();
                    spinnerList.clear();
                    for (ConferenceProducts.RegistrationProductsBean conferenceProducts : registrationProductsBeans) {

                        spinnerList.add(conferenceProducts.getType());
                        /*HashSet<String> hashSet = new HashSet<String>(spinnerList);
                        spinnerList.clear();
                        spinnerList.addAll(hashSet);*/

                    }

                    HashSet<String> hashSet = new HashSet<String>(spinnerList);
                    List<String> sortedList = new ArrayList<>(hashSet);
                    Collections.sort(sortedList);
                    spinnerList.clear();
                    spinnerList.addAll(sortedList);


                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(PaymentActivity1.this, android.R.layout.simple_spinner_dropdown_item, spinnerList);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerCategory.setAdapter(adapter);
                    spinnerCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            categoryType = spinnerCategory.getSelectedItem().toString();
                            Log.d(TAG, "onItemSelected: " + categoryType);
                            getConferenceProducts(currencyType, categoryType);


                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });


                }
            }

            @Override
            public void onFailure(@NotNull Call<ConferenceProducts> call, @NotNull Throwable t) {
                progressBar.setVisibility(View.GONE);
            }
        });
    }

    private void getConferenceProducts(String currencyType, String categoryType) {

        progressBar.setVisibility(View.VISIBLE);
        apiInterface = RetrofitClient.getClient(this).create(ApiInterface.class);
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("conf_id", conf_Id);

        Log.d(TAG, "RESPONSE_ID" + jsonObject);

        apiInterface.processDataConferenceProducts(jsonObject).enqueue(new Callback<ConferenceProducts>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(@NotNull Call<ConferenceProducts> call, @NotNull Response<ConferenceProducts> response) {


                if (response.isSuccessful()) {
                    // Stopping Shimmer Effect's animation after data is loaded to ListView

                    progressBar.setVisibility(View.GONE);

                    categoryTypeList.clear();
                    assert response.body() != null;
                    registrationProductsBeans = response.body().getRegistration_products();
                    for (ConferenceProducts.RegistrationProductsBean conferenceProducts : registrationProductsBeans) {

                        txtDate1.setText("On/Before\n" + conferenceProducts.getEarly());
                        txtDate2.setText("Final Call\n" + conferenceProducts.getFinalX());
                        // txtDate3.setText("Final Call\n" + conferenceProducts.getFinalX());


                        if (currencyType.equalsIgnoreCase("$")) {
                            if (categoryType.equalsIgnoreCase(conferenceProducts.getType())) {

                                Log.d(TAG, "onResponseTYPE: " + categoryType + "    " + conferenceProducts.getType());
                                Log.d(TAG, "onResponsePrice: " + conferenceProducts.getPrice1() + "    " + conferenceProducts.getPrice2());

                                categoryTypeList.add(new Categories(conferenceProducts.getProductid(),
                                        conferenceProducts.getProductname(),
                                        conferenceProducts.getPrice1(),
                                        conferenceProducts.getPrice2(),
                                        conferenceProducts.getPrice3(),
                                        "$",
                                        conferenceProducts.getType(),
                                        conferenceProducts.getEarly(),
                                        "",
                                        conferenceProducts.getFinalX(), "remove"));
                            }

                        } else if (currencyType.equalsIgnoreCase("\u20ac")) {
                            if (categoryType.equalsIgnoreCase(conferenceProducts.getType())) {

                                Log.d(TAG, "onResponseTYPE: " + categoryType + "    " + conferenceProducts.getType());
                                Log.d(TAG, "onResponsePrice: " + conferenceProducts.getPrice4() + "    " + conferenceProducts.getPrice5());

                                categoryTypeList.add(new Categories(conferenceProducts.getProductid(),
                                        conferenceProducts.getProductname(),
                                        conferenceProducts.getPrice4(),
                                        conferenceProducts.getPrice5(),
                                        conferenceProducts.getPrice6(),
                                        "\u20ac",
                                        conferenceProducts.getType(),
                                        conferenceProducts.getEarly(),
                                        "",
                                        conferenceProducts.getFinalX(), "remove"));
                            }


                        } else if (currencyType.equalsIgnoreCase("\u00a3")) {
                            if (categoryType.equalsIgnoreCase(conferenceProducts.getType())) {

                                Log.d(TAG, "onResponseTYPE: " + categoryType + "    " + conferenceProducts.getType());
                                Log.d(TAG, "onResponsePrice: " + conferenceProducts.getPrice7() + "    " + conferenceProducts.getPrice8());

                                categoryTypeList.add(new Categories(conferenceProducts.getProductid(),
                                        conferenceProducts.getProductname(),
                                        conferenceProducts.getPrice7(),
                                        conferenceProducts.getPrice8(),
                                        conferenceProducts.getPrice9(),
                                        "\u00a3",
                                        conferenceProducts.getType(),
                                        conferenceProducts.getEarly(),
                                        "",
                                        conferenceProducts.getFinalX(), "remove"));
                            }

                        }


                    }


                    if (categoryTypeList.size() == 0) {
                        catCard.setVisibility(View.GONE);
                    } else {
                        catCard.setVisibility(View.VISIBLE);
                    }


                    ArrayAdapter<Categories> adapterCat =
                            new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, categoryTypeList);
                    adapterCat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerCategoryProduct.setAdapter(adapterCat);
                    adapterCat.notifyDataSetChanged();


                    spinnerCategoryProduct.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            Categories categories = (Categories) parent.getItemAtPosition(position);

                            txtPrice1.setText(categories.getCurrencyType() + categories.getPrice1());
                            txtPrice2.setText(categories.getCurrencyType() + categories.getPrice2());

                            textAdd1.setChecked(false);


                            if (txtPrice1.isEnabled()) {

                                txtPrice1.setTextColor(Color.parseColor("#ffe42828"));
                                txtPrice1.setBackgroundResource(R.drawable.rounded_no_ouline);
                                catPrice = 0;

                            } else if (txtPrice2.isEnabled()) {

                                txtPrice2.setTextColor(Color.parseColor("#ffe42828"));
                                txtPrice2.setBackgroundResource(R.drawable.rounded_no_ouline);
                                catPrice = 0;

                            }

                            try {

                                @SuppressLint("SimpleDateFormat")
                                SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy");

                                Date date1 = formatter.parse(currentDate);

                                Date date2 = formatter.parse(categories.getEarlyDate());
                                assert date2 != null;
                                if (date2.compareTo(date1) < 0) {
                                    Log.d(TAG, "onBindViewHolder:  current date is greater than early date ");
                                    txtPrice1.setTextColor(Color.GRAY);
                                    txtPrice1.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
                                    txtPrice1.setEnabled(false);


                                } else {
                                    txtPrice1.setEnabled(true);
                                    Log.d(TAG, "onBindViewHolder:  current date is less than early date ");
                                }

                                Date date3 = formatter.parse(categories.getNormalDate());
                                assert date3 != null;
                                if (date3.compareTo(date1) < 0) {
                                    Log.d(TAG, "onBindViewHolder:  current date is greater than early date ");
                                    txtPrice2.setTextColor(Color.GRAY);
                                    txtPrice2.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
                                    txtPrice2.setEnabled(false);

                                } else {
                                    txtPrice2.setEnabled(true);
                                    Log.d(TAG, "onBindViewHolder:  current date is less than early date ");
                                }

                               /* Date date4 = formatter.parse(categories.getFinalDate());
                                assert date4 != null;
                                if (date4.compareTo(date1) < 0) {
                                    Log.d(TAG, "onBindViewHolder:  current date is greater than early date ");
                                    txtPrice3.setTextColor(Color.GRAY);
                                    txtPrice3.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
                                    txtPrice3.setEnabled(false);
                                    textAdd1.setVisibility(View.GONE);

                                } else {
                                    txtPrice3.setEnabled(true);
                                    textAdd1.setVisibility(View.VISIBLE);
                                    Log.d(TAG, "onBindViewHolder:  current date is less than early date ");
                                }
*/
                            } catch (ParseException e1) {
                                e1.printStackTrace();
                            }

                            textAdd1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                    if (isChecked) {


                                        //  getConferenceProducts(currencyType, categoryType);
                                        catProduct = categories.getTitle();
                                        catProduct_Id = categories.getRegproducts_id();

                                        if (txtPrice1.isEnabled()) {

                                            productType = "early";
                                            txtPrice1.setTextColor(Color.parseColor("#4CAF50"));
                                            txtPrice1.setBackgroundResource(R.drawable.rounded_ouline);
                                            Log.d(TAG, "bind: " + "price11");
                                            catPrice = Integer.parseInt(categories.getPrice1());

                                        } else {
                                            productType = "final";
                                            txtPrice2.setTextColor(Color.parseColor("#4CAF50"));
                                            txtPrice2.setBackgroundResource(R.drawable.rounded_ouline);
                                            Log.d(TAG, "bind: " + "price22");
                                            catPrice = Integer.parseInt(categories.getPrice2());

                                        }


                                    } else {

                                        getConferenceProducts(currencyType, categoryType);

                                        catProduct = "";
                                        catProduct_Id = "";

                                        if (txtPrice1.isEnabled()) {

                                            txtPrice1.setTextColor(Color.parseColor("#ffe42828"));
                                            txtPrice1.setBackgroundResource(R.drawable.rounded_no_ouline);
                                            catPrice = 0;

                                        } else {

                                            txtPrice2.setTextColor(Color.parseColor("#ffe42828"));
                                            txtPrice2.setBackgroundResource(R.drawable.rounded_no_ouline);
                                            catPrice = 0;

                                        }

                                    }


                                    totalCount = catPrice;

                                    //txtTotalPrice.setText(currencyType + String.format("%.2f", (double) totalCount));
                                    calculateCartTotal("", catProduct, catProduct_Id);
                                }
                            });


                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });


                }

            }

            @Override
            public void onFailure(@NotNull Call<ConferenceProducts> call, @NotNull Throwable t) {
                //progressBar1.setVisibility(View.GONE);
                progressBar.setVisibility(View.GONE);
            }
        });


    }


    // total Amount
    @SuppressLint("SetTextI18n")
    public void calculateCartTotal(String value, String catProduct, String catProduct_Id) {
        int grandTotal = 0;

        /*if (value.equalsIgnoreCase("remove") || value.equalsIgnoreCase("add")) {
           // addOnItemArrayList.clear();
            for (Categories order : categoriesAddOnList) {

                grandTotal += Double.parseDouble(order.getPrice1()) * order.getQuantity();

                if (order.getStatus().equalsIgnoreCase("add")) {

                    addOnItemArrayList.add(new AddOnItem(order.getRegproducts_id(), order.getTitle(), order.getPrice1(), order.getStatus(), "Add-On Registrations"));
                    Log.d(TAG, "calculateCartTotal: " + order.getTitle());
                }

            }
        }*/


        finalTotal = (int) (grandTotal + totalCount);
        // totalCount = totalCount + grandTotal;
        Log.e("TOTAL", "" + "Items | " + "  DISCOUNT : " + grandTotal + "TOTAL_COUNT" + finalTotal);
        txtTotalPrice.setText(currencyType + String.format("%.2f", (double) finalTotal));


        // button Function
        if (finalTotal > 0) {
            btnProceed.setAlpha(0.9f);
            btnProceed.setEnabled(true);
        } else {
            btnProceed.setAlpha(0.5f);
            btnProceed.setEnabled(false);
        }
        btnProceed.setOnClickListener(v -> {
            Intent intent = new Intent(PaymentActivity1.this, CheckOutActivity.class);
            Bundle bundle = new Bundle();

            bundle.putString("conf_Id", conf_Id);
            bundle.putString("title", actionTitle);
            bundle.putString("shorttitle", shorttitle);
            bundle.putString("conf_type", conf_type);
            bundle.putString("userName", userName);
            bundle.putString("emailID", emailID);
            bundle.putString("mobileNumber", mobileNumber);
            bundle.putString("country", country);
            bundle.putString("productType", productType);
            bundle.putString("catProductTitle", categoryType);
            bundle.putString("catProduct", catProduct);
            bundle.putString("catProduct_Id", catProduct_Id);
            bundle.putString("catPrice", String.valueOf(catPrice));

            bundle.putString("currencyType", currencyType);
            bundle.putString("totalAmount", String.valueOf(finalTotal));
            intent.putExtra("checkOutData", bundle);
            startActivity(intent);


        });

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}
