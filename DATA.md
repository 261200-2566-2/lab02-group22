<h2> 1). give a complete description of AirPurifier class</h2>
what should be instance variables?

*     SerialNo : String
*     Brand : String
*     Model : String
*     PowerCons : double
*     Color : String
*     Dimension : double[]
*     power : boolean
*     currentSpeed : int
*     Mode : String

what should be instance methods?
*     turnON() : void
*     turnOFF() : void
*     setSpeed(int) : void 
*     setMode(String) : void


what should be class variables?
*     ModelCount: int[]
*     ModelType : String[]

what should be class methods?
*     mostPopularModel()


<h2>2). for each method proposed above, how do you plan to implement it?</h2>
<h3>give an overview of the computation</h3>
what's needed as inputs?
what's to be returned?


turnON() : void
ไม่ได้รับ input และทำการเปลี่ยนค่า power เป็น true และเปลี่ยน CurrentSpeed ตามโหลด ณ ตอนก่อนปิด

turnOFF() : void
ไม่ได้รับ input และทำการเปลี่ยนค่า power เป็น false และทำการเปลี่ยน CurrentSpeed เป็น 0 และไม่มี return ค่า

setSpeed(int) : void 
ทำการรับ input เป็นที่มี type เป็น int ที่มาจาก setMode เพื่อเปลี่ยนค่า CurrentSpeed ตาม input ที่ได้รับเข้ามา และไม่มี return ค่า

setMode(String) : void
ทำการรับ input เป็น String เพื่อทำการเปลี่ยนเป็น mode อื่นตามจำนวน mode ที่มีแบบ switch case และทำการไป setSpeed ตามโหมด และไม่มี return ค่า

mostPopularModel() : String
ไม่ได้ทำการรับ input มีการทำงานคือ return ค่า ModelType ที่มีค่า ModelCount ที่มากที่สุดเป็น String
