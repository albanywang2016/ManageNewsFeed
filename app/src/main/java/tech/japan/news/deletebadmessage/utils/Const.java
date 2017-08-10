package tech.japan.news.deletebadmessage.utils;

import tech.japan.news.deletebadmessage.controller.AppVolleySingleton;

/**
 * Created by lei.wang on 3/8/2017.
 */

public class Const {

    public static int USER_ID = 0;
    public static String CURRENT_CHANNEL = "";

    public static final String TAG = AppVolleySingleton.class.getSimpleName();
    public static final String FILE_PATH = "Asahi.json";
    public static final String ASAHI = "Asahi";
    public static final String ASAHI_JSON = "https://apiwiki.fxcorporate.com/api/examples/Asahi.json";
    //public static final String GET_JSON_VIA_PHP = "http://10.0.2.2/rssfeed/local_rssfeed/mysqli_get_all_message.php";
    //public static final String GET_JSON_VIA_PHP =  "http://localhost/rssfeed/local_rssfeed/mysqli_get_all_message.php";

    //public static final String USER_REGISTER_PHP = "http://10.0.2.2/rssfeed/user_register.php";
    //public static final String USER_LOGIN_PHP = "http://10.0.2.2/rssfeed/user_login.php";
    //public static final String USER_FORGOT_PASSWORD_PHP = "http://10.0.2.2/rssfeed/user_get_password.php";

    public static final String USER_REGISTER_PHP = "http://japannews.tech/php/user_register.php";
    public static final String USER_LOGIN_PHP = "http://japannews.tech/php/user_login.php";
    public static final String USER_FORGOT_PASSWORD_PHP = "http://japannews.tech/php/user_get_password.php";
    public static final String GET_JSON_VIA_PHP = "http://japannews.tech/php/mysqli_get_all_message.php";
    public static final String GET_MESSAGE_BY_CHANNEL = "http://japannews.tech/php/get_message_by_channel.php";
    public static final String GET_PACKAGE_VERSION_PHP = "http://japannews.tech/php/get_package_version.php";
    public static final String DELETE_MESSAGE_BY_ID = "http://japannews.tech/php/delete_message_by_id.php";

    public static final String CHANNEL_TOPIC = "Topic";
    public static final String CHANNEL_DOMESTIC = "Domestic";
    public static final String CHANNEL_INTERNATIONAL = "International";
    public static final String CHANNEL_BUSINESS = "Business";
    public static final String CHANNEL_ENTERTAINMENT = "Entertainment";
    public static final String CHANNEL_SPORT = "Sport";
    public static final String CHANNEL_SCIENCE = "Science";
    public static final String CHANNEL_LIFE = "Life";
    public static final String CHANNEL_LOCAL = "Local";
    public static final String CHANNEL_MAGAZINE = "Magazine";
    public static final String CHANNEL_VEDIO = "Vedio";
    public static final String APPLICATION_NAME = "messagecardview";
    public static final String PROGRAM_NAME = "program_name";

    public static final String JSON_ARRAY_TAG = "Json_array_tag";
    public static final String ITEM = "item";
    public static final String MESSAGE_ID = "message_id";
    public static final String ID = "id";
    public static final String PUB_DATE = "pub_date";
    public static final String SOURCE_NAME = "source_name";
    public static final String TITLE = "title";
    public static final String CHANNEL = "channel";
    public static final String TIME = "time";
    public static final String LINK = "link";
    public static final String IMAGE_URL = "image_url";
    public static final String HAS_IMAGE = "has_image";
    public static final String IMAGE_WIDTH = "image_width";
    public static final String IMAGE_HEIGHT = "image_height";
    public static final String CONTENTS_URL = "contents_url";
    public static final String CONTENTS = "contents";
    public static final int WORD_HEIGHT = 40;
    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_EMAIL = "email";
    public static final String CREATED_DATE = "created_date";
    public static final String LAST_LOGIN = "last_login";

    public static final String OOPS = "Oops";

    public static final String ERROR = "Error";
    public static final String DUPLICATE_ENTRY = "1062";
    public static final String SUCCESSFULLY = "Successfully";


}
