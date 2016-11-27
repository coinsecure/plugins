//
// SuccessOrderData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class SuccessOrderData: JSONEncodable {
    public var time: Int64?
    public var vol: Int64?
    public var rate: Int64?
    public var orderID: String?
    public var status: String?
    public var humanTime: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["time"] = self.time?.encodeToJSON()
        nillableDictionary["vol"] = self.vol?.encodeToJSON()
        nillableDictionary["rate"] = self.rate?.encodeToJSON()
        nillableDictionary["orderID"] = self.orderID
        nillableDictionary["status"] = self.status
        nillableDictionary["human_time"] = self.humanTime
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}