IF DB_ID('webst3') IS NULL
BEGIN
    CREATE DATABASE webst3;
END
GO

USE webst3;
GO

-- Khi ứng dụng chạy lần đầu, DataInitializer sẽ tự tạo ROLE_USER,
-- ROLE_ADMIN và tài khoản admin nếu chưa tồn tại.
