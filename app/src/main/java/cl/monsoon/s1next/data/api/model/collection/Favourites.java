package cl.monsoon.s1next.data.api.model.collection;

import com.google.common.base.Objects;
import com.squareup.moshi.Json;

import java.util.List;

import cl.monsoon.s1next.data.api.model.Favourite;

public final class Favourites {

    @Json(name = "perpage")
    private int favouritesPerPage;

    @Json(name = "count")
    private int total;

    @Json(name = "list")
    private List<Favourite> favouriteList;

    public Favourites(int favouritesPerPage, int total, List<Favourite> favouriteList) {
        this.favouritesPerPage = favouritesPerPage;
        this.total = total;
        this.favouriteList = favouriteList;
    }

    public int getFavouritesPerPage() {
        return favouritesPerPage;
    }

    public int getTotal() {
        return total;
    }

    public List<Favourite> getFavouriteList() {
        return favouriteList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favourites that = (Favourites) o;
        return favouritesPerPage == that.favouritesPerPage &&
                total == that.total &&
                Objects.equal(favouriteList, that.favouriteList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(favouritesPerPage, total, favouriteList);
    }
}
