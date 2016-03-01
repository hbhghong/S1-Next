package cl.monsoon.s1next.viewmodel;

import android.databinding.ObservableField;
import android.view.View;

import cl.monsoon.s1next.data.api.model.artificial.Emoticon;
import cl.monsoon.s1next.data.event.EmoticonClickEvent;
import cl.monsoon.s1next.widget.EventBus;

public final class EmoticonViewModel {

    public final ObservableField<Emoticon> emoticon = new ObservableField<>();

    public View.OnClickListener clickEmotion(EventBus eventBus) {
        return v -> {
            // notify ReplyFragment that emoticon had been clicked
            eventBus.post(new EmoticonClickEvent(emoticon.get().getEntity()));
        };
    }
}
