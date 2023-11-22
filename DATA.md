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
ไม่ได้รับ input และทำการเปลี่ยนค่า power เป็น true เมื่อ power นั้นปิดอยู่ และไม่มี return ค่า

turnOFF() : void
ไม่ได้รับ input และทำการเปลี่ยนค่า power เป็น false เมื่อ power นั้นเปิดอยู และไม่มี return ค่า

setSpeed(int) : void 
ทำการรับ input เป็นที่มี type เป็น int เพื่อเปลี่ยน fanSpeed ตาม input ที่ได้รับเข้ามา และไม่มี return ค่า

setMode(int) : void
ทำการรับ input เป็น int เพื่อทำการเปลี่ยนเป็น mode อื่นตามจำนวน mode ที่มี และไม่มี return ค่า

getAirQuality() : int 
ไม่มีการรับค่า input และมีการ return ค่า AirQuality ณ ตอนนั้นเป็น currentPM ที่เป็น int