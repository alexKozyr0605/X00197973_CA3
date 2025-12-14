package org.example;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite                                              // Marks this as a test suite
@IncludeEngines("cucumber")                        // Use Cucumber for testing
@SelectClasspathResource("features")               // Where to find feature files
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")  // Nice formatting
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.example")
public class RunCucumberTest {
    
}