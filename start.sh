java -jar ./build/libs/xunit.jar
echo $?
if [ "$?" -ne "0" ]; 
then
  echo "Execute Success"
else 
  echo "Sorry,Test Failed"
fi

