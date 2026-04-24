<h1>4 tính chất của OOP</h1>

<h2>Tính đóng gói (Encapsulation)</h2> Sử dụng các từ khoá <strong>public, private, protected</strong> 
chỉ định phạm vi truy cập của các thuộc tính và phương thức qua đó nhằm bảo mật thông tin trong class.


<img src="image.png">


<h2>Tính kế thừa (Inheritance)</h2> Lớp con có thể kế thừa các thuộc tính và phương thức của lớp cha, 
có thể chỉnh sửa và phát triển các thuộc tính và phương thức đó, sử dụng từ khoá <strong>extends</strong>.

<h2>Tính đa hình (Polymorphism)</h2> gồm 2 khái niệm ghi đè phương thức (overriding method) giúp lớp con có thể định nghĩa lại phương thức được kế thừa từ lớp cha, 
nạp chồng phương thức (overloading method) nghĩa là trong 1 lớp các phương thức có thể định nghĩa cùng tên nhưng khác tham số truyền vào.

<h2>Tính trừu tượng (Abstraction)</h2> gồm khái niệm abstract class dùng để tạo ra khuôn mẫu chữa những thuộc tính và phương thức ảo (abstract method) 
mà những class kế thừ bắt buộc phải có mà các class kế thừa có thể định nghĩa lại và sử dụng chúng;
Interface tương tự abstract class nhưng mức đồ trừu tượng cao hơn (các thuộc tính phải là hằng chứa giá trị và các phương thức bên trong được mặc định là abstract method).


<h1>Constructors</h1>

<h2>Hàm khởi tạo (Constructors)</h2> dùng để khởi tạo nhanh các thuộc tính khi khai báo đối tượng
