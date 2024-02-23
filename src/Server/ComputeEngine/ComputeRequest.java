package server.computeEngine;
import user.InputConfig;
import user.OutputConfig;

public interface ComputeRequest {
    InputConfig getInputConfig();
    OutputConfig getOutputConfig();
    char getDelimiter();
}
