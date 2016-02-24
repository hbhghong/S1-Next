package cl.monsoon.s1next.data.api.model.wrapper;

import com.google.common.base.Objects;
import com.squareup.moshi.Json;

import cl.monsoon.s1next.data.api.typeadapter.OriginalAccountInfo;
import cl.monsoon.s1next.data.api.model.Result;

public final class ResultWrapper {

    @Json(name = "Message")
    private Result result;

    @Json(name = "Variables")
    private OriginalAccountInfo originalAccountInfo;

    public ResultWrapper(Result result, OriginalAccountInfo originalAccountInfo) {
        this.result = result;
        this.originalAccountInfo = originalAccountInfo;
    }

    public Result getResult() {
        return result;
    }

    public OriginalAccountInfo getOriginalAccountInfo() {
        return originalAccountInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultWrapper that = (ResultWrapper) o;
        return Objects.equal(result, that.result) &&
                Objects.equal(originalAccountInfo, that.originalAccountInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(result, originalAccountInfo);
    }
}
