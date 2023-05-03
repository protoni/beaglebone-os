import unittest
import os
from oeqa.oetest import oeRuntimeTest, skipModule
from oeqa.utils.decorators import *

def setUpModule():
    pass


class Example(oeRuntimeTest):

    @classmethod
    def setUpClass(self):
        pass

    def setUp(self):
        self.target = self.target
        super(Example, self).setUp()

    def test_file_exists(self):
        (status,output) = self.target.run('ls -lai /test.txt')
        self.assertEqual(status, 1, msg="status and output: %s and %s" % (status,output))

    @classmethod
    def tearDownClass(self):
        pass
