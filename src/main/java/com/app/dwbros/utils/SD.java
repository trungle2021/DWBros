package com.app.dwbros.utils;

import org.springframework.beans.factory.annotation.Value;

public class SD {

    public static final String ACCOUNT = "Account";
    public static final String BILL_IMAGE = "Bill_Image";
    public static final String BILL = "Bill";
    public static final String CUISINE = "Cuisine";
    public static final String FAVORITE_CUISINE = "Favorite_Cuisine";
    public static final String FOOD = "Food";
    public static final String FOOD_CATEGORY = "Food_Category";
    public static final String FOOD_TYPE = "Food_Type";
    public static final String MATERIAL = "Material";
    public static final String MEAL_TIME = "Meal_Time";
    public static final String RECIPE = "Recipe";
    public static final String RECIPE_DETAIL = "Recipe_Detail";
    public static final String REMAIN_MATERIAL = "Remain_Material";
    public static final String USER = "User";
    public static final String ROLE = "Role";
    public  static final  String[] AUTH_WHITELIST = {
            // -- Swagger UI v3 (OpenAPI)
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/swagger-resources/**",
            "/swagger-ui.html",
            "/webjars/**",
            // auth api
            "/api/auth/**",
    };


}
