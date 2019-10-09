package com.slionh.funhere.service.impl;

import com.slionh.funhere.entity.Patientinfo;
import com.slionh.funhere.entity.PatientinfoExample;
import com.slionh.funhere.mapper.PatientinfoMapper;
import com.slionh.funhere.service.PatientinfoService;
import com.slionh.funhere.util.WebUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * Create by s lion h on 2019-09-30
 */
@Service
public class PatientinfoServiceImpl implements PatientinfoService {
    @Resource
    private PatientinfoMapper patientinfoMapper;
    @Autowired
    private WebUtil webUtil;

    private String locationKey = "d5d7781b0799369378ab10bf8fc76555";
    private String apiUrl = "https://restapi.amap.com/v3/geocode/geo?key=%s&address=%s";


    @Override
    public void updateLocationMsg() {
        PatientinfoExample example = new PatientinfoExample();
        List<Patientinfo> list = patientinfoMapper.selectByExample(example);

        for (Patientinfo patientinfo:list){
//            if (i>20)
//                return;
            String url = String.format(apiUrl,locationKey,patientinfo.getHome());
//            System.out.println(url);
            String content = webUtil.getContent(url);

            JSONObject jsonObject=new JSONObject(content);

            String status = jsonObject.getString("status");
            String info = jsonObject.getString("info");
            String count = jsonObject.getString("count");

            if (status!=null&&!status.equals("")&&count!=null&&!count.equals("0")){
                System.out.println(content);
//                获取项编码信息
                String formatted_address = jsonObject.getJSONArray("geocodes").getJSONObject(0).getString("formatted_address");
                String country = jsonObject.getJSONArray("geocodes").getJSONObject(0).getString("country");
                String province = jsonObject.getJSONArray("geocodes").getJSONObject(0).getString("province");
                String city = jsonObject.getJSONArray("geocodes").getJSONObject(0).getString("city");
                String citycode = "";
                if (jsonObject.getJSONArray("geocodes").getJSONObject(0).has("citycode"))
                    citycode = jsonObject.getJSONArray("geocodes").getJSONObject(0).getString("citycode");
                String district = jsonObject.getJSONArray("geocodes").getJSONObject(0).getString("district");
                String street = "";
//                if (jsonObject.getJSONArray("geocodes").getJSONObject(0).has("street"))
                     street = jsonObject.getJSONArray("geocodes").getJSONObject(0).getString("street");
                String number = jsonObject.getJSONArray("geocodes").getJSONObject(0).getString("number");
                String adcode = jsonObject.getJSONArray("geocodes").getJSONObject(0).getString("adcode");
                String location = jsonObject.getJSONArray("geocodes").getJSONObject(0).getString("location");
                String level = jsonObject.getJSONArray("geocodes").getJSONObject(0).getString("level");

                patientinfo.setFormattedAddress(formatted_address);
                patientinfo.setCountry(country);
                patientinfo.setProvince(province);
                patientinfo.setCity(city);
                patientinfo.setCitycode(citycode);
                patientinfo.setDistrict(district);
                patientinfo.setStreet(street);
                patientinfo.setNumber(number);
                patientinfo.setAdcode(adcode);
                patientinfo.setLocation(location);
                patientinfo.setLevel(level);

                PatientinfoExample updatePatient = new PatientinfoExample();

                patientinfoMapper.updateByPrimaryKey(patientinfo);
            }
            System.out.println(patientinfo.toString());
        }
    }
}
