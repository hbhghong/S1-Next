package cl.monsoon.s1next.data.api;

import android.text.TextUtils;

import cl.monsoon.s1next.data.User;
import cl.monsoon.s1next.data.api.typeadapter.OriginalAccountInfo;
import cl.monsoon.s1next.data.api.model.wrapper.ResultWrapper;

public final class UserValidator {

    private static final String INVALID_UID = "0";

    private final User mUser;

    public UserValidator(User user) {
        this.mUser = user;
    }

    /**
     * Intercepts the data in order to check whether current user's login status
     * has changed and update user's status if needed.
     *
     * @param d   The data we want to intercept.
     * @param <D> The data type.
     * @return Original data.
     */
    public <D> D validateIntercept(D d) {
        OriginalAccountInfo originalAccountInfo = null;
//        if (d instanceof PostsWrapper) {
//            originalAccountInfo = ((PostsWrapper) d).getPosts();
//        } else if (d instanceof ThreadsWrapper) {
//            originalAccountInfo = ((ThreadsWrapper) d).getThreadsCount();
//        } else if (d instanceof ForumGroupsWrapper) {
//            originalAccountInfo = ((ForumGroupsWrapper) d).getForumGroups();
//        } else if (d instanceof FavouritesWrapper) {
//            originalAccountInfo = ((FavouritesWrapper) d).getFavourites();
//        } else
if (d instanceof ResultWrapper) {
            originalAccountInfo = ((ResultWrapper) d).getOriginalAccountInfo();
        }

        if (originalAccountInfo != null) {
            validate(originalAccountInfo);
        }

        return d;
    }

    /**
     * Checks current user's login status and updates {@link User}'s in our app.
     */
    public void validate(OriginalAccountInfo originalAccountInfo) {
//        final boolean logged = mUser.isLogged();
//        String uid = originalAccountInfo.getUid();
//        if (INVALID_UID.equals(uid) || TextUtils.isEmpty(uid)) {
//            if (logged) {
//                // if originalAccountInfo has expired
//                mUser.setUid(null);
//                mUser.setName(null);
//                mUser.setLogged(false);
//            }
//        } else {
//            if (!logged) {
//                // if originalAccountInfo has logged
//                mUser.setUid(uid);
//                mUser.setName(originalAccountInfo.getUsername());
//                mUser.setLogged(true);
//            }
//        }
//        mUser.setPermission(originalAccountInfo.getPermission());
//        mUser.setAuthenticityToken(originalAccountInfo.getAuthenticityToken());
    }
}
