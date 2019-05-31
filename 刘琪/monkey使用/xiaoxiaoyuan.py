from com.android.monkeyrunner import MonkeyRunner,MonkeyDevice
device=MonkeyRunner.waitForConnection()
device.installPackage('d:\demo\Xiaoxiaoyuan.apk')
package = 'com.google.blockly.demo'
activity='com.google.blockly.android.demo.Welcome'
runComponent = package + '/' + activity
device.startActivity(component=runComponent)
#device.press('KEYCODE_MENU',MonkeyDevice.DOWN_AND_UP)
result = device.takeSnapshot()
result.writeToFile('d:\demo\pic\shot1.png','png')
