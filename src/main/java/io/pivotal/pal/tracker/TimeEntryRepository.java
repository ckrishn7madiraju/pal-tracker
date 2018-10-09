package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

import java.sql.Time;
import java.util.List;

public interface TimeEntryRepository {

    public TimeEntry create(TimeEntry timeEntry);

    public TimeEntry find(long id);

    public List<TimeEntry> list();

    public TimeEntry update(long id, TimeEntry timeEntry);

    public void delete(long id);

}
