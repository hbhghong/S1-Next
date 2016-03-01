package cl.monsoon.s1next.data.api.typeadapter;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;

public final class AndroidMessageAdapter {

    private static final String FULLWIDTH_COMMA = "，";
    private static final String FULLWIDTH_FULL_STOP = "。";

    @FromJson
    @AndroidMessage
    public String fromJson(String message) {
        return addFullStopIfNeeded(message);
    }

    @ToJson
    public String toJson(@AndroidMessage String message) {
        throw new UnsupportedOperationException();
    }

    /**
     * We need to add a full stop after a non-single sentence.
     * <p>
     * see https://www.google.com/design/spec/style/writing.html#writing-capitalization-punctuation
     * Periods: Omit for fragments and single sentences in affordances like toasts,
     * snackbars, butterbars, and labels. Do punctuate full sentences in body text,
     * for example, in the body of dialogs.
     * <p>
     * see https://github.com/Discuz-X/DiscuzX/blob/master/source/language/lang_message.php
     */
    public static String addFullStopIfNeeded(String text) {
        if (text.contains(FULLWIDTH_COMMA) && !text.endsWith(FULLWIDTH_FULL_STOP)) {
            return text + FULLWIDTH_FULL_STOP;
        }
        return text;
    }
}
