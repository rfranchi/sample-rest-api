package com.liferay.sample.rest;

import com.liferay.sample.model.SampleModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/service/api")
public class SampleRestController {

    @GetMapping("/samples")
    public ResponseEntity<List<SampleModel>> getSamples() {
        List<SampleModel> samples = Arrays.asList(
                new SampleModel(1, "Sample 1"),
                new SampleModel(2, "Sample 2"));

        return new ResponseEntity<>(samples, HttpStatus.OK);
    }

    @PostMapping("/sample")
    public ResponseEntity<SampleModel> createSample(@RequestBody SampleModel sampleModel) {
        // Simulate creating Sample in database...
        return new ResponseEntity<SampleModel>(sampleModel, HttpStatus.OK);
    }

    // ...

}
