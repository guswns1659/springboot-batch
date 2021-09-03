package com.titanic.springbootbatch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PersonStepExecutionListener implements StepExecutionListener {

    @Override
    public void beforeStep(StepExecution stepExecution) {
        log.info("<<<<< Step starts");

    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        log.info("<<<<< Step ends");
        return null;
    }
}
