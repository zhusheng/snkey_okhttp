package com.example.snkey_okhttp;

/**
 * <p>
 *
 * </p>
 *
 * @author ZhuSheng
 * @since 2/4/21 8:38 AM
 */
public class API {
    /**
     * 注意，这里访问的是本地的java项目，不能写localhost必须写本机ip。
     */
    public static final String HOST = "http://192.168.13.121:9090";
    public static final String GET = HOST + "/test/myuser/listUser";
    public static final String POST = HOST + "/test/myuser/saveOrUpdate";
    public static final String PICTURE_CAT = "https://www.hdnicewallpapers.com/Walls/Big/Cat/Beautiful_Angry_Kitten.jpg";
    public static final String ANIMAL_DETECT = HOST + "/baidu/animalDetect";
    public static final String CAR_DETECT = "";
    public static final String CAR_DETECT2 = "";
}
