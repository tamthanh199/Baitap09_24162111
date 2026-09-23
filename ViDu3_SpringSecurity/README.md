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

Hoặc dùng file `database/setup.sql`.

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
