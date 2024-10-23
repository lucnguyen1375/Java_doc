# JAVA buổi 1

## 1. Java là gì

**Java** là một **ngôn ngữ lập trình bậc cao, hướng đối tượng, bảo mật và mạnh mẽ**, và là một Platform.

**Ứng dụng cùa Java**
    Ngôn ngữ Java được sử dụng phổ biến trong phát triển phần mềm, trang web, game hay ứng dụng trên các thiết bị di động

## 2. Lí do ra đời của Java

Java được khởi đầu bởi James Gosling và bạn đồng nghiệp ở Sun MicroSystem năm 1991. 
Ban đầu Java được tạo ra nhằm mục đích viết phần mềm cho các sản phẩm gia dụng và có tên là Oak (Cây sồi).
Java được chính thước phát hành năm 1994, đến năm 2010 được Oracle mua lại từ Sun MicroSystem.

## 3. Cách Java hoạt động, điều gì xảy ra khi chạy code Java(.java)

Ngôn ngữ lập trình thường được chia làm 2 loại (tùy theo cách hiện thực hóa ngôn ngữ đó) là ngôn ngữ thông dịch và ngôn ngữ biên dịch
> **Thông dịch (Interpreter)** Nó dịch từng câu lệnh rồi chạy từng lệnh, lần sau muốn chạy lại thì phải dịch lại.
> **Biên dịch (Compiler)** Code sau khi được biên dịch sẽ tạo ra 1 file thường là .exe, và file .exe này có thể đem sử dụng lại không cần biên dịch nữa

Java thuộc lại ngôn ngữ vừa biên dịch vừa thông dịch. Cụ thể
Khi viết mã, hệ thống tạo ra một tệp .java. Khi Biên dịch mã ngòn của chương trình sẽ được biên dịch ra mã byte code. Máy áo Java (Java Vỉtual Machine) sẽ thông dịch mã byte code này thành machine code (hay natice code) khi nhận được yêu cầu chạy chương trình 
## 4. Cấu trúc một chương trình Java
Bản chất Java là lập trình hướng đối tượng nên:
- Một chương trình Java được tạo nên bởi nhiều đối tượng.
- Mỗi đối tượng rong Java được tạo nên từ một `class`.
- Một `class` giống hư một bản thiết kế bao gồm biến và cá hàm thể hiện trạng thái và chức năng của từng đối tượng.
## 5. Package là gì?
Package là một namespace, một nơi chứa và tổ chức các class, interface liên quan tới nhau.

Về mặt khái niệm, thì bạn có thể hiểu package giống như một folder trên máy tính, các class, interface thì giống như các file trong một folder vậy.

Khi lưu trữ file trên máy tính thì các bạn cũng chia ra các folder và đặt tên (folder học tập, folder giải trí, …), mỗi folder lại chia ra các folder nhỏ hơn. Điều này giúp bạn dễ dàng tìm kiếm file, hiểu chức năng của các file trong một folder.
## 6. Syntax cơ bản 

### 6.1 Khai báo biến nguyên thủy
#### Biến và Kiểu dữ liệu trong Java
Biến là nơi để lưu dữ liệu trong quá trình ứng dụng thi hành. Biến có tên biến (ví dụ age, name,...) dùng để lưu dữ liệu vào đó và lấy dữ liệu từ đó ra, mỗi bién cũng thuộc về một `kiểu dữ liệu` cho biết loại dữ liệu mà biến có thể lưu giữ.
Một số kiểu dữ liệu nguyên thủy trong java.
| Kiểu dữ liệu | Kích thước | Mô tả                              | Phạm vi            |
| ------------ | ---------- | ---------------------------------- | ------------------ |
| byte         | 1 byte     | Kiểu số nguyên                     | -128 -> 127        |
| char         | 2 byte     | Kiểu kí tự hoặc số nguyên không âm | 0 đến u\ffff       |
| boolean      | 1 byte     | Trạng thái                         | True, False        |
| short        | 2 byte     | Kiểu số nguyên                     | -2^15 đến 2^15 - 1 |
| int          | 4 byte     | Kiểu số nguyên                     | -2^31 đến 2^31 - 1 |
| long         | 8 byte     | Kiểu số nguyên                     | -2^63 đến 2^63 -1  |
| float        | 4 byte     | Kiểu số thực                       |                    |
| double       | 8 byte     | Kiểu số thực                       |                    |

**Cách khai báo biến**
`<Kiểu dữ liệu> <Tên biến>;`
VD: 
    - int a,b;
    - float pi;
    - char c;
**Cách khởi tạo biến**
Để khởi tạo biến, phải gán cho nó một giá trị hợp lệ.
VD : a = 5;
    pi = 3.14f;
    c = 'a';

Có thể kết hợp khai báo biến và khởi tạo biến cùng một lúc.
VD
    int a = 5;
    char c = 'a';

**Các loại biến trong Java**
In Java, có ba loại biến:
-   Biến cục bộ
-   Biến thể hiện
-   Biến tĩnh
1) Biến cục bộ
Biến cục bộ là một biến được khai báo bên trong phần thân của một phương thức.

2) Biến thể hiện
Các biến thể hiện được xác định mà không có từ khóa STATIC. Chúng được xác định bên ngoài khai báo phương thức. Chúng là các đối tượng cụ thể và được gọi là các biến thể hiện.

3) Biến tĩnh
Các biến tĩnh chỉ được khởi tạo một lần khi bắt đầu thực hiện chương trình. Các biến này phải được khởi tạo trước, trước khi khởi tạo bất kỳ biến thể hiện nào.
### 6.2 Vòng lặp
Java có 3 vong lặp cơ bản, bạn có thể sử dụng một trong ba vòng lặp sau:

**Vòng lặp for
Vòng lặp while
Vòng lặp do…while**

**Về cơ bản cú pháp và cách sử dụng giống C++**
#### 6.2.1. Vòng lặp for
    Cấu trúc 
        for (Khoi_Tao ; Dieu_Kien ; Cap_Nhat) 
        { 
            // code
        } 

**For Each**
    Cấu trúc 
        for (Type var : array) 
        { 
            // Code
        } 
        
#### 6.2.2 Vòng lặp while
    Cú pháp:
    while (condition) 
    {
        // Khối lệnh được lặp lại cho đến khi condition là sai (condition = false)
    }

#### 6.2.3 Vòng lặp do while
    Cú pháp
    do 
    { 
        // Khối lệnh được thực thi
    } while(condition);

### 6.3 Câu lệnh rẽ nhánh

#### 6.3.1. Câu lệnh if
    Cú pháp
        if(condition)
        {
            //code chạy khi condition đúng
        }

#### 6.3.2 if else
    Cú pháp
        if(condition)
        {
            // code chạy khi condition đúng
        }
        else
        {
            // code chạy khi condition sai
        }

#### 6.3.3 if else if
    Cú pháp
        if(condition1)
        {
            // code chạy khi condition1 đúng
        }
        else if(condition2)
        {
            // code chạy khi condition2 đúng
        }
        ....
        elsei if(condition_n)
        {
            // code chạy khi condition_n đúng
        }
        else
        {
            // code chạy khi không có condition nào đúng
        }

### 6.4 Mảng trong Java
>Mảng là tập hợp các đối tượng có cùng kiểu dữ liệu và được lưu trữ gần nhau trong bộ nhớ. Mỗi đối tượng hay được gọi là phần tử, các phần từ được phân biệt bằng vị trí (hay chỉ số phần tử), được bắt đầu từ vị trí 0. tử đầu tiên là 0.

**Phân loại mảng**
    Có hai kiểu mảng trong java
  - Mảng 1 chiều
  - Mảng đa chiều
  
#### Mảng 1 chiều  
**Khai báo mảng**
*Cú pháp khai báo*
> datatype[] arr;
> datatype arr[];

*Cú pháp cấp phát bộ nhớ để tạo mảng:*
> <tên mảng> = new <kiểu dữ liệu>[kích cỡ mảng];

*Cú pháp rút gọn hơn:*
> <kiểu dữ liệu> [] <tên mảng> = new <kiểu dữ liệu>[kích cỡ mảng];

**Ví dụ**
    public class HelloWorld
    {

        public static void main(String []args)
        {
            int[] a;
            a = new int[3];
            a[0] = 5;
            a[1] = 2;
            a[2] = 1;
            System.out.println(a);
            for (int i=0; i<a.length; i++)
            {
                System.out.println(a[i]);
            }
        }
    }

*Cú pháp khởi tạo cho mảng*
> <kiểu dữ liệu> [] <tên mảng> = {<giá trị>,…}

    public class HelloWorld
    {
        public static void main(String []args){
            char[] a = {'L', 'u', 'c', 'N','g','u','y','e','n};
            System.out.print(a);
        }
    }
#### Mảng đa chiều
Cú pháp khai báo:

> <kiểu dữ liệu> [][] <tên mảng> = new <kiểu dữ liệu>[kích cỡ hàng] [kích cỡ cột];


Cú pháp khởi tạo cho mảng:

> <kiểu dữ liệu> [][] <tên mảng> = {{các giá trị hàng 1}, {các giá trị hàng 2},… {các giá trị hàng n}}
### 6.5 Tổng quan về Class và Object

#### 6.5.1 Class
`Một lớp (Class)` là một nhóm các đối tượng có các thuộc tính chung. Nó là một mẫu hoặc bản thiết kế mà từ đó tạo ra các đối tượng. Nó là một thực thể logic. Nó không thể là vật lý.

>Một lớp trong Java có thể chứa:
>Trường (Fields)
>Phương thức (Method)
>Constructors (Hàm tạo)
>Khối (Block)
>Lớp lồng nhau (Nested class) và Interface

#### 6.5.2 Object
Một thực thể có trạng thái và hành vi được gọi là một `đối tượng (Object)`.Nó có thể là vật lý hoặc logic (hữu hình và vô hình).
Một đối tượng có ba đặc điểm:

>**State:** Trạng thái thể hiện dữ liệu (giá trị) của một đối tượng.
>**Behavior:** Thể hiện hành vi (chức năng) của một đối tượng như gửi tiền, rút ​​tiền, v.v.
>**Indentity:** Một danh tính đối tượng thường được triển khai thông qua một ID duy nhất. Giá trị của ID không hiển thị cho người dùng bên ngoài. Tuy nhiên, nó được JVM sử dụng nội bộ để xác định duy nhất từng đối tượng.

#### 6.5.2 Sự khác biệt giữa Class và Object
Một lớp là một bản thiết kế hoặc nguyên mẫu xác định các biến và phương thức (hoặc hàm) chung cho tất cả các đối tượng cùng kiểu. Đối tượng là các thể hiện cụ thể của các lớp. Đối tượng thường được sử dụng để mô tả các đối tượng trong thế giới thực mà bạn nhìn thấy hàng ngày.
## Keyword `this, constructor, access modifier, getter, setter, static `

| Keyword         | Mô tả                                                                                                                                                                                                  |
| --------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| this            | Tham chiếu đến đối tượng hiện tại trong một phương thức hoặc hàm tạo cố định                                                                                                                           |
| constructor     | Constructor trong java là một dạng đặc biệt của phương thức được sử dụng để khởi tạo các đối tượng.                                                                                                    |
| access modifier | Access Modifer trong Java xác định phạm vi có thể truy cập của biến, phương thức, constructor hoặc lớp  Trong java, có 4 phạm vi truy cập của Access Modifier như sau:private,default,protected,public |
| gettervà setter | Setter và Getter là 2 phương thức sử dụng để cập nhật hoặc lấy ra giá trị thuộc tính, đặc biệt dành cho các thuộc tính ở phạm vi private.                                                              |
| static          | Được sử dụng để tạo các phần tử của lớp, không cần tạo đối tượng của lớp đó                                                                                                                            |





