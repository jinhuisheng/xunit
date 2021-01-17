java -jar ./build/libs/xunit.jar xunit.MyTestSuite
if [ "$?" -ne "0" ];
then
  echo "Sorry,Test Failed"
else
  echo "Execute Success"
fi

