from oeqa.runtime.case import OERuntimeTestCase
from oeqa.core.decorator.depends import OETestDepends

class ExampleTest(OERuntimeTestCase):
    def test_files_exists(self):
        (status, output) = self.target.run("ls -lai /etc/test.txt")
        self.assertEqual(status, 0, msg="status and output: %s and %s" % (status,output))

        (status, output) = self.target.run("ls -lai /usr/bin/example")
        self.assertEqual(status, 0, msg="status and output: %s and %s" % (status,output))
