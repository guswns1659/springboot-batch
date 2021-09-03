package com.titanic.springbootbatch;

import javax.batch.api.listener.StepListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PersonChunkListener implements ChunkListener {

    @Override
    public void beforeChunk(ChunkContext context) {
        log.info("chuck transaction starts");

    }

    @Override
    public void afterChunk(ChunkContext context) {
        log.info("chuck transaction committed");
    }

    @Override
    public void afterChunkError(ChunkContext context) {

    }
}
