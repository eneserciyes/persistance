package tr.com.merciyes.persistance.mapper;

import org.mapstruct.Mapper;
import tr.com.merciyes.commons.mapper.AbstractBoMapper;
import tr.com.merciyes.commons.model.Event;
import tr.com.merciyes.persistance.entity.EventEntity;

@Mapper(componentModel = "spring")
public abstract class EventMapper extends AbstractBoMapper<Event,EventEntity> {
    @Override
    public abstract Event convert(EventEntity entity);

    @Override
    public abstract EventEntity convert(Event model);
}
