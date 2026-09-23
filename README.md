# Baitap09_24162111

Repository gồm 3 ví dụ:

```text
Baitap09_24162111
├── ViDu1_Login
├── CustomLogin
└── ViDu3_SpringSecurity
```

---

## 1. ViDu1_Login

### Database

Database sử dụng:

```text
webst4
```

Tạo database bằng SQL Server:

```sql
IF DB_ID('webst4') IS NULL
BEGIN
    CREATE DATABASE webst4;
END
GO
```

### Cấu hình database

Project sử dụng file `.env`.

Tạo file:

```text
ViDu1_Login/.env
```

Nội dung:

```properties
DB_URL=jdbc:sqlserver://localhost:1433;databaseName=webst4;encrypt=false;trustServerCertificate=true;sslProtocol=TLSv1.2;characterEncoding=UTF-8
DB_USERNAME=sa
DB_PASSWORD=YOUR_SA_PASSWORD
```

File `.env` đã được thêm vào `.gitignore` và không được upload lên GitHub.

### Port

```text
8091
```

### URL

Trang chủ:

```text
http://localhost:8091/
```

Trang đăng nhập:

```text
http://localhost:8091/login
```

Dashboard:

```text
http://localhost:8091/dashboard
```

### Tài khoản kiểm tra

```text
Email: admin@gmail.com
Password: 123456
Role: ADMIN
```

Sau khi đăng nhập thành công, Spring Security chuyển tới `/dashboard`.

---

## 2. CustomLogin

### Database

Database sử dụng:

```text
webst5
```

Tạo database:

```sql
IF DB_ID('webst5') IS NULL
BEGIN
    CREATE DATABASE webst5;
END
GO
```

### Cấu hình database

Tạo:

```text
CustomLogin/.env
```

Nội dung:

```properties
DB_URL=jdbc:sqlserver://localhost:1433;databaseName=webst5;encrypt=false;trustServerCertificate=true;sslProtocol=TLSv1.2;characterEncoding=UTF-8
DB_USERNAME=sa
DB_PASSWORD=YOUR_SA_PASSWORD
```

File `.env` không được upload lên GitHub.

### Port

```text
8092
```

### URL

Trang đăng nhập:

```text
http://localhost:8092/login
```

Trang chủ sau khi đăng nhập:

```text
http://localhost:8092/
```

### Tài khoản kiểm tra

Có thể đăng nhập bằng **username**:

```text
Username: user01
Password: 123456
```

hoặc bằng **email**:

```text
Email: user01@gmail.com
Password: 123456
```

Thông tin user mẫu:

```text
Full name: Đoàn Thành Tâm
Username: user01
Email: user01@gmail.com
Role: ROLE_USER
```

---

# Ví dụ 3 - Spring Boot + Security + MapStruct

## 1. Tạo database

Chạy:

```sql
IF DB_ID('webst3') IS NULL
BEGIN
    CREATE DATABASE webst3;
END
GO
```

Hoặc dùng file `ViDu3_SpringSecurity/database/setup.sql`.

## 2. Cấu hình `.env`

Project đã có file `.env` với giá trị mẫu. Sửa các mục sau trước khi chạy:

```properties
DB_PASSWORD=YOUR_SA_PASSWORD
MAIL_USERNAME=YOUR_GMAIL@gmail.com
MAIL_PASSWORD=YOUR_GMAIL_APP_PASSWORD
CLOUDINARY_CLOUD_NAME=YOUR_CLOUD_NAME
CLOUDINARY_API_KEY=YOUR_API_KEY
CLOUDINARY_API_SECRET=YOUR_API_SECRET
```

## 3. Chạy project

Import project vào STS bằng **Existing Maven Projects**, sau đó chạy `ShopApplication.java` bằng **Run As -> Spring Boot App**.

Mặc định:

```text
http://localhost:8093
```

## 4. Tài khoản admin có sẵn

`DataInitializer` tự tạo `ROLE_USER`, `ROLE_ADMIN` và tài khoản admin khi chạy lần đầu:

```text
Username: admin
Password: 123456
Email: admin@gmail.com
Role: ROLE_ADMIN
```

Tài khoản này dùng để test CRUD User.
