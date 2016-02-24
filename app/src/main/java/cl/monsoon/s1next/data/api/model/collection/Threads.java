package cl.monsoon.s1next.data.api.model.collection;

import com.google.common.base.Objects;
import com.squareup.moshi.Json;

import java.util.List;

import cl.monsoon.s1next.data.api.model.Forum;
import cl.monsoon.s1next.data.api.model.Thread;
import cl.monsoon.s1next.data.api.model.Thread.ThreadListInfo;

public final class Threads {

    @Json(name = "forum")
    private final ThreadListInfo threadListInfo;

    @Json(name = "forum_threadlist")
    private final List<Thread> threadList;

    @Json(name = "sublist")
    private final List<Forum> subForumList;

    public Threads(ThreadListInfo threadListInfo, List<Thread> threadList, List<Forum> subForumList) {
        this.threadListInfo = threadListInfo;
        this.threadList = threadList;
        this.subForumList = subForumList;
    }

    public ThreadListInfo getThreadListInfo() {
        return threadListInfo;
    }

    public List<Thread> getThreadList() {
        return threadList;
    }

    public List<Forum> getSubForumList() {
        return subForumList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threads threads = (Threads) o;
        return Objects.equal(threadListInfo, threads.threadListInfo) &&
                Objects.equal(threadList, threads.threadList) &&
                Objects.equal(subForumList, threads.subForumList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(threadListInfo, threadList, subForumList);
    }
}
