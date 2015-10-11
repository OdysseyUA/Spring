package com.springinaction.knights;

import com.springinaction.knights.exceptions.QuestException;

/**
 * Created by Odyssey on 11.10.2015.
 */
public interface Knight {
    void embarkOnQuest() throws QuestException;
}
