package de.neemann.digital.core.memory;

import de.neemann.digital.TestExecuter;
import de.neemann.digital.core.Model;
import de.neemann.digital.core.ObservableValue;
import de.neemann.digital.core.element.ElementAttributes;
import junit.framework.TestCase;

/**
 * @author hneemann
 */
public class CounterTest extends TestCase {

    public void testCounter() throws Exception {
        ObservableValue clk = new ObservableValue("clk", 1);
        ObservableValue clr = new ObservableValue("clr", 1);

        Model model = new Model();
        Counter out = model.add(new Counter(
                new ElementAttributes()
                        .setBits(8)));
        out.setInputs(clk, clr);

        TestExecuter sc = new TestExecuter(model).setInputs(clk, clr).setOutputs(out.getOutputs());
        sc.check(0, 0, 0);
        sc.check(1, 0, 1);
        sc.check(0, 0, 1);
        sc.check(1, 0, 2);
        sc.check(0, 0, 2);
        sc.check(1, 0, 3);
        sc.check(0, 0, 3);
        sc.check(0, 1, 0);
    }


}