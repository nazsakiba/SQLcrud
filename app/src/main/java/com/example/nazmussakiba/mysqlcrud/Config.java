package com.example.nazmussakiba.mysqlcrud;

/**
 * Created by Nazmus Sakiba on 3/9/2016.
 */
public class Config {

    //Address of our scripts of the CRUD
    public static final String URL_ADD="http://nazsakiba.info/Track/addEmp.php";
    public static final String URL_GET_ALL = "http://nazsakiba.info/Track/getAllEmp.php";
    public static final String URL_GET_EMP = "http://nazsakiba.info/Track/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = "http://nazsakiba.info/Track/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://nazsakiba.info/Track/deleteEmp.php?id=";

    //Keys that will be used to send the request to php scripts
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "name";
    public static final String KEY_EMP_DESG = "desg";
    public static final String KEY_EMP_SAL = "salary";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_DESG = "desg";
    public static final String TAG_SAL = "salary";

    //employee id to pass with intent
    public static final String EMP_ID = "emp_id";
}
