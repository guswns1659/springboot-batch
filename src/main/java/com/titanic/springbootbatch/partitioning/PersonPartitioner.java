package com.titanic.springbootbatch.partitioning;

import java.util.Map;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.stereotype.Component;

@Component
public class PersonPartitioner implements Partitioner {

    // TODO :
    @Override
    public Map<String, ExecutionContext> partition(int gridSize) {
        return null;
    }
}
