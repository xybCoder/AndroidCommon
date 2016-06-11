# Android 开发常用工具类

标签（空格分隔）： 未分类

---

## SPUtil   SharedPreferences工具

 1. getSpName(Context context)  获取SharedPreferences存储在sd卡中的文件名字
 2. setSP(Context context, String key, Object object) 根据传入不同参数类型调用不同的保存方法
 3. getSP(Context context, String key, Object defaultObject) 根据默认值得到保存的数据的具体类型，然后调用对应方法获取值
 4. removeSP(Context context, String key) 移除某个key值已经对应的值
 5. clearAllSP(Context context) 清除所有SharedPreferences数据
 6. contains(Context context, String key) 查询某个key是否存在
 7. getAllKeyValue(Context context) 返回所有的键值对
 
## DateUtil 时间工具
 DateUtils类里面重载方法比较多
 8. str2Date(...) 将时间字符串转换成Date
 9. date2Str(...) 将Date转换成时间字符串
 10. str2Calendar(...) 将时间字符串转换成Calendar
 11. getCurDateStr(...) 获得当前日期的字符串
 12. getMillon(...) 获得当前日期的字符串,精确到秒
 13. strAddOneDay(...) 实现加一天的功能，返回的格式为String
 14. strDecreaseOneDay(...) 实现减一天的功能，返回的格式为String
 15. getLastdayDate(...) 获取昨天 Data
 16. getNextdayDate(...) 获取明天Date
 17. isTheSameDay(...) 判断是否是同一天
 
##  LogUtil 日志工具
 18. init 初始化日志开关和TAG(默认日志为开,TAG为"ghost")
 19. v VERBOSE
 20. d DEBUG
 21. i INFO
 22. w WARN
 23. e ERROR
 24. a ASSERT
 25. json 输出json
 26. xml 输出xml
##  StringUtil 字符串工具
 27. isEmpty(CharSequence str) 判断是否是空字符串、null、""
 28. subStringOmit(String subject, int size) 字符串截取到指定长度size+...的形式
 29. getLimitLengthStr(String str, int len, String symbol)截取字符串　超出的字符用symbol代替
 30. getStrLength(String str)获取字符串的实际长度（考虑了汉字的情况一个汉字按照俩个字符算）
 31. getHideEmailPrefix(String email)隐藏邮件地址前缀
 32. Str2List(String str,String symbol)字符串分割成一个数组
 33. List2Str(List list, String symbol)将list 用传入的分隔符组装为String
 34. replaceBracketStr(String str) 全角括号转为半角
 35. full2Half(String str)全角字符变半角字符
 36. replaceBlank(String str)去除字符串中的空格、回车、换行符、制表符
 37. str2Unicode(String string)字符串转换unicode
 38. unicode2Str(String unicode)unicode 转字符串
 39. trimPunct(String str)删除所有的标点符号
 40. SimilarDegree(String str1, String str2)字符串相似度比较
 41. getStrEncode(String str)获取字符串的编码
 42. countSubStr(String string, String str)获取字符串str在String中出现的次数
 43. nullToEmptyStr(Object str)空对象转化为空串
 44. capitalizeFirstLetter(String str)首字母大写
 45. utf8Encode(String str)str使用UTF-8编码
 
 ## GsonUtil Gson工具
 46. object2Json(...)object转json
 47. json2List(String jsonStr) jsonStr转List
 48. json2Map(String jsonStr)jsonStr转Map
 49. json2Bean(String jsonStr, Class<?> cl)  jsonStr转Bean
 50. getJsonValue(String jsonStr, String key) 获取key值
 
## JsonUtil Json工具
 51. getLong(String jsonData, String key, long defaultValue)
 52. getInt(String jsonData, String key, int defaultValue)
 53. getDouble(String jsonData, String key, Double defaultValue)
 54. getString(String jsonData, String key, String defaultValue)
 55. getStringArray(String jsonData, String key, String[] defaultValue)
 56. getStringList(String jsonData, String key, List<String> defaultValue)
 57. getJSONArray(String jsonData, String key, JSONArray defaultValue)
 58. getBoolean(String jsonData, String key, Boolean defaultValue)
 59. getMap(String jsonData, String key)
 
## DeviceUtil  设备信息工具
 60. getAndroidID(...) 获取AndroidID
 61. getIMEI(...) 获取设备IMEI码
 62. getIMSI(...) 获取设备IMSI码
 63. getWifiMacAddr(...) 获取MAC地址
 64. getIP(...) 获取网络IP地址(优先获取wifi地址)
 65. getWifiIP(...) 获取WIFI连接下的ip地址
 66. getGPRSIP(...) 获取GPRS连接下的ip地址
 67. getSerial(...) 获取设备序列号
 68. getSIMSerial(...) 获取SIM序列号
 69. getPhoneNumber(...) 获取手机号码(未获取成功)
 70. getMNC(...) 获取网络运营商 46000,46002,46007 中国移动,46001 中国联通,46003 中国电信
 71. getCarrier(...) 获取网络运营商：中国电信,中国移动,中国联通
 72. getModel(...) 获取硬件型号
 73. getBuildBrand(...) 获取编译厂商
 74. getBuildHost(...) 获取编译服务器主机
 75. getBuildTags(...) 获取描述Build的标签
 76. getBuildTime(...) 获取系统编译时间
 77. getBuildUser(...) 获取系统编译作者
 78. getBuildVersionRelease(...) 获取编译系统版本(5.1)
 79. getBuildVersionCodename(...) 获取开发代号
 80. getBuildVersionIncremental(...) 获取源码控制版本号
 81. getBuildVersionSDK(...) 获取编译的SDK
 82. getBuildID(...) 获取修订版本列表(LMY47D)
 83. getSupportedABIS(...) CPU指令集
 84. getManufacturer(...) 获取硬件制造厂商
 85. getBootloader(...) 获取系统启动程序版本号
 86. getScreenDisplayID(...)
 87. getDisplayVersion(...) 获取系统版本号
 88. getLanguage(...) 获取语言
 89. getCountry(...) 获取国家
 90. getOSVersion(...) 获取系统版本:5.1.1
 91. getGSFID(...) 获取GSF序列号
 92. getBluetoothMAC(...) 获取蓝牙地址
 93. getPsuedoUniqueID(...) Android设备物理唯一标识符
 94. getFingerprint(...)构建标识,包括brand,name,device,version.release,id,version.incremental,type,tags这些信息
 95. getHardware(...) 获取硬件信息
 96. getProduct(...) 获取产品信息
 97. getDevice(...) 获取设备信息
 98. getBoard(...) 获取主板信息
 99. getRadioVersion(...) 获取基带版本(无线电固件版本 Api14以上)
 100. getUA(...) 获取的浏览器指纹(User-Agent)
 101. getDensity(...) 获取得屏幕密度
 102. getGoogleAccounts(...) 获取google账号
 
## AppUtils   APP工具类
 
 103. getAppName(...) 获取应用名称
 104. getAppIcon(...) 获取应用图标
 105. getAppDate(...) 获取应用更新日期
 106. getAppSize(...) 获取应用大小
 107. getAppApk(...) 获取应用apk文件
 108. getAppVersionName(...) 获取应用版本名称
 109. getAppVersionCode(...) 获取应用版本号
 110. getAppInstaller(...) 获取应用的安装市场
 111. getAppPackageName(...) 获取应用包名
 112. hasPermission(...) 是否有权限
 113. isInstalled(...) 应用是否安装
 114. installApk(...) 安装应用
 115. uninstallApk(...) 卸载应用
 116. isSystemApp(...) 是否是系统应用
 117. isServiceRunning(...) 服务是否在运行
 118. stopRunningService(...) 停止服务
 119. getNumCores(...) 获取Cpu内核数
 120. killProcesses(...) 结束进程
 121. runScript(...) 运行脚本
 122. getRootPermission(...) 获得root权限
 
## BitmapUtil bitmap的工具类

 123. bytes2Bitmap(...) Byte[]转Bitmap
 124. bitmap2Bytes(...) Bitmap转Byte[]
 125. bitmap2Drawable(...) Bitmap转Drawable
 126. drawable2Bitmap(...)Drawable转Bitmap
 127. bitmap2File(...) bitmap转file
 128. rotateBitmap(Bitmap bmp, int degrees) 旋转图像
 129. getBitmapSize(Bitmap bitmap)获取bitmap的大小
 130. getBestOptions(...)计算目标宽度，目标高度，inSampleSize
 131. calculateBestInSampleSize(...)计算Bitmap最适合大小
 132. createScaleBitmap(...)进行缩放，得到符合标准的bitmap
 133. getRoundedCornerBitmap(Bitmap bitmap, float roundPx)获取圆角图片
 134. compressImage(Bitmap image)质量压缩
 135. Bitmap compressFixBitmap(Bitmap bitMap, int outWidth, int outHeight)固定大小质量压缩

## NetUtils 网络工具

 1. getNetworkType 获取网络类型
 2. getNetworkTypeName 获取网络名称
 3. isConnected 检查网络状态
 4. isNetworkAvailable 网络可用性
 5. isWiFi 是否wifi
 6. openNetSetting 打开网络设置界面
 7. setWifiEnabled 设置wifi状态
 8. getWifiScanResults 获取wifi列表
 9. getScanResultsByBSSID 过滤扫描结果
 10. getWifiConnectionInfo 获取wifi连接信息


## SystemUtils 系统工具

 1. getDefaultThreadPoolSize(...)获取默认线程池大小
 2. sendSMS(...) 调用系统发送短信
 3. forwardToDial(...) 跳转到拨号
 4. callPhone(...) 直接呼叫号码
 5. sendMail(...) 发邮件
 6. hideKeyBoard(...) 隐藏系统键盘
 7. isBackground(...) 判断当前应用程序是否后台运行
 8. isSleeping(...) 判断手机是否处理睡眠
 9. isRooted(...)是否root
 10. isRunningOnEmulator(...) 当前设备是否是模拟器
 11. goHome(...) 返回Home
 12. getDeviceUsableMemory(...) 获取设备可用空间
 13. gc(...) 清理后台进程和服务
 14. createDeskShortCut(...) 创建桌面快捷方式
 15. createShortcut(...) 创建快捷方式
 16. shareText(...) 分享文本
 17. shareFile(...) 分享文件(此方法是调用FileUtils.shareFile中的方式)
 18. getShareTargets(...) 获取可接受分享的应用
 19. getCurrentLanguage(...)获取当前系统的语言
 20. isGpsEnabled GPS(...)是否打开
 21. showSoftInputMethod(Context context, EditText editText) 显示软键盘
 22. closeSoftInputMethod(...) 关闭软键盘
 23. showSoftInput(Context context) 显示软键盘
 24. closeSoftInput(...) 关闭软键盘

## FileUtil  文件工具类

 1. countLines(File file)获取文件的行数
 2. List<String> Lines(File file)以列表的方式获取文件的所有行
 3. appendLine(File file, String str)在文件末尾追加一行
 4. cleanFile(File file) 快速清空一个超大的文件
 5. mimeType(String file)获取文件的Mime类型
 6. fileType(File file)获取文件的类型
 7. modifyTime(File file)获取文件最后的修改时间
 8. hash(File file)获取文件的Hash
 9. copy(...)复制文件
 10. copyDir(...)复制目录
 10. createPaths(String paths)创建多级目录
 11. deleteFile(File file)删除一个文件
 12. deleteFile(String path)删除文件
 13. deleteDir(File file)删除一个目录
 14. searchFile(File dirPath, String fileName)在指定的目录下搜寻文个文件
 15. writeFile(...)将内容写入文件
 16. getFileName(String filePath)获取文件名
 17. getFolderName(String filePath)获取路径名
 18. getFileSize(String path)获取文件大小
 19. isFileExist(String filePath)判断文件是否存在
 20. openVideo(Context mContext, String videoPath)打开video

## VerificationUtil  验证工具类

 1. matcherRealName(String value) 判断姓名格式
> 1.真实姓名可以是汉字,也可以是字母,但是不能两者都有,也不能包含任何符号和数字
> 2.如果是英文名,可以允许英文名字中出现空格
> 3.英文名的空格可以是多个,但是不能连续出现多个
> 4.汉字不能出现空格

 2. matcherPhoneNum(String value) 判断手机号格式 (匹配11数字,并且13-19开头)
 3. matcherAccount(String value) 判断账号格式 (4-20位字符)
 4. matcherPassword(String value) 判断密码格式 (6-12位字母或数字)
 5. matcherPassword2(String value) 判断密码格式(6-12位字母或数字,必须同时包含字母和数字)
 6. matcherEmail(String value) 判断邮箱格式
 7. matcherIP(String value) 判断IP地址
 8. matcherUrl(String value) 判断URL (http,https,ftp)
 9. matcherVehicleNumber(String value) 判断中国民用车辆号牌
 10. matcherIdentityCard(String value) 判断身份证号码格式
 11. isNumeric(String value) 是否数值型
 12. testRegex(String regex, String inputValue) 是否匹配正则
 13. checkPostcode(String postcode) 匹配中国邮政编码

## ZipUtil 压缩文档相关的工具类
## WindowUtil 与屏幕相关的工具类
## ValidUtil 提供一些对象有效性校验封装类
## StreamUtil 流相关的操作方法封装
## EncryptUtil　常用加密工具类
## ClassUtil 反射相关的一些工具类
## ChinesUtil 中文相关的操作封装类
## CharsetUtil 编码相关的封装类
## SingletonUtil　单例工具封装类
## ResourceUtil 获取 Assets，Raw 文件封装类
## ScreenUtil 用单位转换的辅助类
   
  
 
