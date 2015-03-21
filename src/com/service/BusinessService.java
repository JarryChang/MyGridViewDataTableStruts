package com.service;

import java.io.*;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

import com.model.RevenueReport;

public class BusinessService {
	public static List<RevenueReport> getCompanyList() {

        List<RevenueReport> listOfCompany = new LinkedList<RevenueReport>();
        String fileName = "Company_Revenue.csv";

        InputStream is = Thread.currentThread().getContextClassLoader()
                        .getResourceAsStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        try {
                CSVReader reader = new CSVReader(br);
                String[] row = null;
                while ((row = reader.readNext()) != null) 
                {
                    listOfCompany.add(new RevenueReport(row[0], row[1], row[2],row[3]));
                }
                reader.close();
        } catch (IOException e) {
                System.err.println(e.getMessage());
        }
        return listOfCompany;
}
}
