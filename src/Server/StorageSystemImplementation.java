package Server;

import java.util.Collections;

import Server.WriteResult.WriteResultStatus;
import User.InputConfig;
import User.OutputConfig;

public class StorageSystemImplementation implements StorageSystem {
    @Override
	public Iterable<Integer> read(InputConfig input) {
		return Collections.emptyList(); // eventually this will be a stream, but for now always return 0 elements
	}

	@Override
	public WriteResult addResult(OutputConfig output, String result) {
		/* 
		 * Using lambda syntax to create an instance of WriteResult. This is an alternative to the ComputeResult approach of providing
		 * constants for success/failure.
		 */
		return () -> WriteResultStatus.FAILURE; 
	}
}
