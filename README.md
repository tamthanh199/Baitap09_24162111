# Baitap09_24162111

Repository gồm 2 ví dụ:

```text
Baitap09_24162111
├── ViDu1_Login
└── CustomLogin
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
