package xunit.testrunner;

import com.google.common.io.Files;
import org.junit.jupiter.api.Test;
import xunit.XunitRunner;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TestRunnerTest {
    @Test
    void run_success() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        String[] args = new String[]{"xunit.MyTestSuite"};
        String file = new String(Files.toByteArray(new File("src/test/runResult.txt")));
        assertThat(XunitRunner.run(args)).isEqualTo(file);
    }
}
