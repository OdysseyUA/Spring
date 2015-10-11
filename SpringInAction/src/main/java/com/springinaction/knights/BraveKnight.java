package com.springinaction.knights;

import com.springinaction.knights.exceptions.QuestException;
import com.springinaction.knights.quest.Quest;

/**
 * Created by Odyssey on 11.10.2015.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
