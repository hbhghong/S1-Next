package cl.monsoon.s1next.data.api.typeadapter;

import com.squareup.moshi.Json;

public class OriginalAccountInfo {

    @Json(name = "member_uid")
    String uid;

    @Json(name = "member_username")
    String username;

    @Json(name = "formhash")
    String authenticityToken;

    @Json(name = "readaccess")
    int permission;
}
