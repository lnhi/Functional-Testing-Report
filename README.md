# Functional-Testing-Report
### Mô tả bài toán
Chương trình giảm giá cho các cuộc gọi đường dài được tính như sau:  
- Bất kỳ cuộc gọi nào bắt đầu lúc hoặc sau 20:00 nhưng trước 08:00 được giảm 50%.
- Bất kỳ cuộc gọi nào bắt đầu lúc hoặc sau 08:00 nhưng trước 20:00 được tính giá đầy đủ.
- Bất kỳ cuộc gọi nào dài hơn 60 phút đều được giảm giá 15% trên chi phí (sau khi trừ đi bất kỳ khoản giảm giá nào khác).
Chương trình đọc thời điểm bắt đầu cuộc gọi dựa trên đồng hồ 24 giờ và thời lượng của cuộc gọi. Thời gian cuộc gọi tối đa là 180 phút.
 
Chương trình trả về:  
- -1 nếu đầu vào không hợp lệ.
- 0 nếu không được giảm giá.
- 1 nếu được giảm 15%.
- 2 nếu được giảm 50%.
- 3 nếu vừa được giảm 50% và 15%.
 
Lưu ý: Chương trình sẽ giả sử chỉ các giá trị số nguyên được nhập vào, thời lượng không âm và thời gian bắt đầu biểu thị thời gian đồng hồ thực.  
### Source code
- Mã nguồn chương trình được lưu trong file [Discount.java](https://github.com/lnhi/Functional-Testing-Report/blob/main/Discount/src/Discount.java)
- File test cases cho kiểm thử với kỹ thuật sử dụng bảng quyết định lưu trong file [test1.java](https://github.com/lnhi/Functional-Testing-Report/blob/main/Discount/Test/test1.java)
- File test cases cho kiểm thử với kỹ thuật phân hoạch tương đương lưu trong file [test2.java](https://github.com/lnhi/Functional-Testing-Report/blob/main/Discount/Test/test2.java)
