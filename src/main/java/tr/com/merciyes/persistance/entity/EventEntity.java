package tr.com.merciyes.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang.ObjectUtils;
import org.springframework.context.annotation.Primary;
import tr.com.merciyes.commons.entity.ResourceEntity;
import tr.com.merciyes.persistance.constants.PersistenceConstants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = PersistenceConstants.Entity.EVENTS_APPROVED)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EventEntity extends ResourceEntity {

    @Column(name = PersistenceConstants.COLS.CLUB)
    private String club;

    @Column(name = PersistenceConstants.COLS.EVENT_TITLE)
    private String eventTitle;

    @Column(name = PersistenceConstants.COLS.DESCRIPTION)
    private String description;

    @Column(name = PersistenceConstants.COLS.DATE)
    private LocalDateTime date;

    @Column(name = PersistenceConstants.COLS.DURATION)
    private String duration;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventEntity that = (EventEntity) obj;

        return ObjectUtils.equals(that.getResourceId(), this.getResourceId())
                && ObjectUtils.equals(that.getClub(), this.getClub())
                && ObjectUtils.equals(that.getEventTitle(), this.getEventTitle());
    }
}
