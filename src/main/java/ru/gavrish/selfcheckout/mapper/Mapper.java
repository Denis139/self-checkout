package ru.gavrish.selfcheckout.mapper;

import java.util.Collection;
import java.util.List;

public interface Mapper<T, S> {

    T from(S source);

    default List<T> from(Collection<S> source) {
        return source.stream()
                .map(this::from)
                .toList();
    }

}
