package tr.com.merciyes.persistance.constants;

import lombok.experimental.UtilityClass;

/**
*
* @author enes.erciyes
*/
@UtilityClass
public class PersistenceConstants {

    public static class Entity {
        public static final String EVENTS_APPROVED = "EVENTS_APPROVED";
        public static final String EVENTS_PENDING = "EVENTS_PENDING";
        public static final String EVENTS_REJECTED = "EVENTS_REJECTED";
    }

    public static class COLS {
        public static final String CLUB = "club";
        public static final String EVENT_TITLE = "eventTitle";
        public static final String DESCRIPTION = "description";
        public static final String DATE = "date";
        public static final String DURATION = "duration";
        public static final String CATEGORY = "category";
    }
}
