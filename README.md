OpenMRS TR Sprint Test Otomasyon Projesi
📍 URL: OpenMRS Project

📌 Proje Açıklaması
OpenMRS, açık kaynaklı bir elektronik sağlık kayıt (EHR) sistemidir. Sağlık hizmeti sunan kuruluşların hasta verilerini yönetmelerine, saklamalarına ve paylaşmalarına yardımcı olur. Özellikle düşük gelirli ülkelerde sağlık hizmetlerini iyileştirmek amacıyla tasarlanmıştır.

OpenMRS:
✅ Tıbbi kayıtları dijitalleştirir
✅ Hasta takibini ve tedavi planlamasını destekler
✅ Sağlık verilerinin analizini kolaylaştırır

Bu proje, yazılım geliştiricileri, sağlık uzmanları ve gönüllülerden oluşan bir topluluk tarafından geliştirilir ve farklı kuruluşların ihtiyaçlarına uyarlanabilir.

Test ortamı olarak kullanacağımız adres: https://demo.openmrs.org
Ana proje sitesi: https://openmrs.org

📑 User Story Özet
#	Kullanıcı Hikayesi
- 1	Sisteme giriş hatalarını kontrol etmek
- 2	Kullanıcı, uygulamaya giriş yapabilmeli
- 3	Kullanıcı, sistemden güvenli bir şekilde çıkış yapabilmeli
- 4	Kullanıcı, hasta bilgilerini girerek sisteme hasta kaydı yapabilmeli
- 5	Kullanıcı, hesap ayarlarına (My Account) ulaşabilmeli
- 6	Doktor, hastaları listeleyebilmeli ve belirli bir hastayı arayabilmeli
- 7	Doktor, belirli bir hastayı sistemden silebilmeli
- 8	Doktor, tüm hastaları listeleyebilmeli
- 9	Hasta kayıtlarını birleştirebilmeli (Merge)

Gereksinimler:
- org.apache.logging.log4j:log4j-api:2.20.0
- org.apache.logging.log4j:log4j-core:2.20.0 
- commons-io:commons-io:2.11.0 
- org.seleniumhq.selenium:selenium-java:4.25.0
- org.slf4j:slf4j-nop:1.7.30
- org.testng:testng:7.9.0
