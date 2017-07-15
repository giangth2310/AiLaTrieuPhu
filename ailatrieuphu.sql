-- MySQL dump 10.13  Distrib 5.7.18, for macos10.12 (x86_64)
--
-- Host: localhost    Database: ailatrieuphu
-- ------------------------------------------------------
-- Server version	5.7.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `answer0` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `answer1` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `answer2` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `answer3` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `rightAnswer` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=65 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'Giải Grand Slam đầu tiên trong năm là giải nào?','Austrlia mở rộng','Wimbledon','Roland Garos','Mỹ mở rộng',0),(2,'Cùng với Hà Nội T&T (vô địch V-League 2010), CLB nào của Việt Nam tham dự AFC Cup 2011?','Sông Lam Nghệ An','SHB Đà Nẵng','Hoàng Anh Gia Lai','Becamex Bình Dương',0),(3,'AFC Asian Cup 2011 được tổ chức tại quốc gia nào?','Qatar','Hàn Quốc','Nhật Bản','Iraq',0),(4,'Đội nào lên ngôi vô địch AFC Asian Cup 2011 tổ chức tại Qatar?\r','Nhật Bản','Australia','Hàn Quốc','Uzbekistan',0),(5,'Ai là nhạc sĩ Việt Nam đầu tiên viết opera với tác phẩm “Cô sao” và sau đó là “Người tạc tượng”?','Đỗ Nhuận','Hoàng Vân','Trần Hoàn','Trọng Đài\r',0),(6,'Sông Bến Hải và sông Thạch Hãn nằm ở tỉnh nào?','Quảng Bình','Quảng Ninh','Quảng Trị','Quảng Ngãi',2),(7,'Trong các cây cầu sau, cầu nào là cầu xoay?','Cầu Thanh Trì','Cầu Thị Nại','Cầu Sông Hàn','Cầu Cần Thơ',2),(8,'Đại Ngu là quốc hiệu của triều đại nào?','Triều Ngô','Triều Hồ','Các chúa Nguyễn','Nhà Tây Sơn\r',1),(9,'Các vua Hùng đặt quốc hiệu nước ta là gì?','Văn Lang','Âu Lạc','Vạn Xuân','Đại Việt',0),(10,'An Dương Vương đặt quốc hiệu nước ta là gì?','Âu Lạc','Vạn Xuân','Đại Cồ Việt','Đại Việt',0),(11,'Năm 1010, Lý Thái Tổ đã cho xây dựng điện nào ở trung tâm hoàng thành Thăng Long?','Điện Kính Thiên','Điện Càn Nguyên','Điện Càn Chánh','Điện Càn Thành',1),(12,'\"Điêu tàn\" là tập thơ đầu tiên của nhà thơ nào?','Anh Thơ','Thế Lữ','Bích Khê','Chế Lan Viên',1),(13,'Hội nghị chống biến đổi khí hậu lần thứ 17- 2011 được tổ chức tại nước nào?','Đan Mạch (2011)','Mexico (2010)','Nam Phi (2011)','Quatar và Hàn Quốc (2012)',2),(14,'Ai được bầu làm Tổng bí thư Đảng cộng sản Việt Nam tại Đại hội XI?','Nguyễn Phú Trọng','Nguyễn Sinh Hùng','Trương Tấn Sang','Nguyễn Tấn Dũng',0),(15,'Tỉnh nào đăng cai tổ chức Năm du lịch Quốc gia 2012?','Thừa Thiên Huế','Hải Phòng','Lâm Đồng','Thanh Hoá',0),(16,'Sự kiện giờ Trái Đất, sáng kiến của WWF được tổ chức lần đầu tiên vào năm 2007 tại thành phố nào?','Sydney','Tokyo','Bắc Kinh','Singapore',0),(17,'Bùi Hữu Nghĩa, một trong bốn rồng vàng của vùng Đồng Nai xưa (tức là toàn Nam Bộ ngày nay) là tài năng ở lĩnh vực nào?','Hoạ','Phú','Đàn','Thi',3),(18,'Giải thưởng nào được lập ra vào năm 2005 được trao cho những người có thành tựu trong việc phát huy và gìn giữ văn hóa dân tộc?','Đào Tấn','Bùi Xuân Phái','Lê Văn Thiêm','Phạm Thuận Dật',0),(19,'Vai trò chính của vitamin nào là giúp cho quá trình đông máu diễn ra tốt và hạn chế lượng máu bị mất khi bị thương?',' Vitamin A','Vitamin D','Vitamin E','Vitamin K',3),(20,'Cúm và sởi là những bệnh lây truyền qua đường nào?','Tiêu hoá','Hô hấp','Sinh dục','Máu',1),(21,'Nước nào ở khu vực Đông Nam Á không có địa giới với bất kỳ nước khác?','Philippines','Malaysia','Lào','Thái Lan',0),(22,'Virus sởi lây truyền qua đường nào?','Tiêu hoá','Hô hấp','Máu','Sinh dục',1),(23,'Tượng đài Mẹ Suốt nằm bên cạnh con sông nào?','Sông Nhật Lệ','Sông Gianh','Sông Long ĐạI','Sông Kiến Giang',0),(24,'The ASEAN WAY-ca khúc chính thức của ASEAN là sáng tác của nhạc sĩ người nước nào?','Thái Lan','Việt Nam','Singapore','Malaysia',0),(25,'Việt Nam lần đầu tiên vô địch AFF Cup là vào năm nào?','2004','2006','2008','2010',2),(26,'Giáo sư Trần Văn Khê nổi tiếng ở lĩnh vực nào?','Toán học','Thiên văn học','Lịch sử','Âm nhạc',3),(28,'Phú Yên-tỉnh đăng cai Năm du lịch quốc gia 2011 ở khu vực nào?','Nam Trung Bộ','Tây Nguyên','Đông Bắc Bộ','Tây Nam Bộ',0),(29,'Bảo tàng Hồ Chí Minh khánh thành vào đúng dịp kỷ niệm lần thứ mấy ngày sinh của chủ tịch Hồ Chí Minh?','70','80','90','100',3),(30,'Lễ Hội Gióng chính thức được nhận bằng Di sản văn hoá thế giới vào năm nào?','2008','2009','2010','2011',2),(33,'Trong các hàm số lượng giác cơ bản, hàm số nào là hàm số chẵn?','y=sinx ','y=cosx ','y-cotgx ','y=tgx ',1),(36,'Paracetamol thuộc nhóm thuốc nào sau đây?','Thuốc lợi tiểu ','Thuốc hạ sốt, giảm đau, chống viêm ','Thuốc điều trị tăng huyết áp ','Thuốc an thần, bình thân ',1),(39,'Thành cổ Sơn Tây do vị vua nào xây dựng nên vào năm 1822?','Gia Long ','Minh Mạng ','Thiệu Trị ','Tự Đức',2),(41,'Tập hợp các số thực được ký hiệu bằng chữ cái nào?','N (Số tự nhiên) ','Z (Số nguyên) ','Q (Số hữu tỷ)','R (Số thực) ',3),(42,'Việt Nam đã đăng cai cuộc thi sắc đẹp nào trong năm 2010?','Hoa hậu thế giới ','Hoa hậu Trái Đất ','Hoa hậu hoàn vũ ','Hoa hậu quốc tế ',1),(45,'Loài hoa nào được chọn là Quốc hoa của Việt Nam?','Hoa sen ','Hoa mai ','Hoa đào ','Hoa hồng ',0),(50,'Bánh pía là đặc sản có nguồn gốc từ tỉnh nào?','Bến Tre ','Sóc Trăng ','Bạc Liêu ','Hậu Giang ',1),(51,'Tác phẩm \"Thuỷ hử\" của Thi Nại Am diễn ra vào triều đại nào của Trung Quốc?','Triều Tống','Triều Nguyên ','Triều Minh ','Triều Thanh ',0),(52,'Chùa nào được Lý Nam Đế cho xây sau khi lên ngôi hoàng đế năm 544 ?','Chùa Trấn Quốc ','Chùa Một Cột ','Chùa Tây Phương ','Chùa Tứ Pháp ',0),(53,'Vạn Thắng Vương là ai ?','Đinh Bộ Lĩnh ','Lê Hoàn ','Lê Lợi ','Nguyễn Huệ ',0),(57,'Tổ chức thương mại thế giới có trụ sở đặt tại quốc gia nào ?','Bỉ ','Thuỵ Sỹ ','Hà Lan ','Đức ',1),(62,'Dấu câu nào được dùng để đánh dấu ranh giới giữa các vế trong câu ghép?','Dấu ba chấm ','Dấu chấm ','Dấu chấm hỏi ','Dấu phẩy',3),(27,'CLB nào vô địch FIFA Club World Cup 2010 tổ chức tại Qatar?','Inter Milan','Real Madrid','Bayern Munich','Manchester United',0),(31,'Phổi, họng, thanh quản, khí quản, phế quản, phổi là những cơ quan thuộc hệ cơ quan nào trong cơ thể người?','Hệ tuần hoàn','Hệ sinh dục','Hệ hô hấp','Hệ thần kinh',2),(32,'Tổng bí thư Trung ương Đản cộng sản Việt Nam được bầu tại Đại hội XI là ai?','Nguyễn Tấn Dũng','Nguyễn Phú Trọng','Nguyễn Minh Triết','Nguyễn Văn An',1),(34,'“Mùa con ong đi lấy mật, mùa con voi xuống sông hút nước, mùa em đi phát rẫy làm nương, anh vào rừng đặt bẫy cài chông” là những  câu hát nói về tháng nào?','Tháng Giêng','Tháng hai ','Tháng ba ','Tháng tư ',2),(35,'Loại vitamin nào mà cơ thể con người có thể tự tổng hợp được nhờ ánh sáng Mặt Trời?','Vitamin A','Vitamin D ','Vitamin E ','Vitamin K ',1),(37,'Điền từ còn thiếu trong câu thành ngữ:”.... Không cứu được ...gần”','Lính-Tướng ','Chồng-Vợ','Nước-Lửa ','Chó-Mèo ',2),(38,'Thung lũng nổi tiếng ở Mỹ với ngành công nghệ thông tin được đặt tên theo nguyên tố nào?','Sắt','Silic','Asen ','Uran ',1),(43,'Nguyên mẫu của nhân vật Hoàng Kim trong bộ phim “Bí thư tỉnh uỷ” của đạo diễn Trần Quốc Trọng là bí thư của tỉnh (cũ) nào?','Vĩnh Phúc','Hải Hưng','Bắc Thái ','Phú Khánh ',0),(44,'Khí nào chiếm 80% thành phần không khí?','N2 ','O2 ','H2 ','Cl2 ',1),(46,'Bộ phim “The Social Network” về mạng xã hội nào đã đạt giải Quả cầu vàng 2011?','Facebook','Twitter','Yahoo Plus ','Opera ',0),(47,'Vận động viên đứng đầu danh sách 100 vận động viên Việt Nam tiêu biểu của năm 2010 là vận động viên Vũ Thị Hương của môn thể thao nào?','Điền kinh','Cờ vua','Karatedo ','Cầu lông ',0),(48,'Truyện “Vợ chồng A Phủ” trong tập truyện Tây Bắc của nhà văn Tô Hoài viết về người dân tộc nào?','Vân Kiều','Thái','H\'Mông ','Tày ',2),(49,'Quốc gia nào giữ chức chủ tịch luân phiên Liên minh châu Âu trong nửa đầu năm 2011?','Hungary','Bungary','Romania ','Ucraikne',0),(54,'Từ 2008, giải thưởng mang tên một trong tứ trụ của nền mỹ thuật Việt Nam hiện đại sẽ được trao thường niên cho những công trình văn hóa nghệ thuật, các ý tưởng thể hiện tình yêu sâu nặng với mảnh đất thủ đô. Đó là hoạ sĩ nào?','Tô Ngọc Vân','Bùi Xuân Phái','Nguyễn Tư Nghiêm ','Nguyễn Sáng',1),(55,'Sau khi chiến thắng quân Nam Hán vào năm 938, Ngô Quyền đã đóng đô ở đâu?','Hoa Lư','Đại La','Cổ Loa ','Phú Xuân ',0),(58,'Truyền kỳ mạn lục, một tác phẩm được đánh giá là \" thiên cổ kỳ bút\", là \"áng văn hay của bậc đại gia\", là sáng tác của ai?','Nguyễn Trãi','Nguyễn Bỉnh Khiêm','Nguyễn Dữ ','Nguyễn Du ',2),(59,'Từ “nhị thánh” trong câu \"Đây là nơi chiến địa buổi Trùng Hưng nhị thánh bắt Ô Mã” (Bạch Đằng giang phú ) gồm những người nào ?','Ngô Quyền và Trần Hưng Đạo.','Ngô Quyền và Trần Thái Tông.','Ngô Quyền và Trần Nhân Tông.','Trần Thánh Tông và Trần Nhân Tông.',3),(61,'Nhà văn nào đại diện cho Việt Nam nhận Giải thưởng văn học Đông Nam Á 2010?','Nguyễn Nhật Ánh (Cho tôi xin một vé đi tuổi thơ)','Cao Duy Sơn (Ngôi nhà xưa bên suối)','Nguyễn Thị Ngọc Tư (Cánh đồng bất tận) ','Trần Văn Tuấn (Rừng thiêng nước trong)',0),(40,'Nhà thơ nào là người Việt Nam đầu tiên nhận Giải thưởng văn học Đông Nam Á vào năm 1996?','Tố Hữu','Nguyễn Đình Thi','Nguyễn Khoa Điềm ','Huy Cận',0),(56,'Năm 2011, nước ta kỷ niệm bao nhiêu năm Bác Hồ ra đi tìm đường cứu nước?','90 năm','100 năm','110 năm ','120 năm ',1);
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `userName` text NOT NULL,
  `password` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','123456'),(2,'guest','123456');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-15 16:15:33
