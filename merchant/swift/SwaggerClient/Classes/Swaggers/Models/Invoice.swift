//
// Invoice.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class Invoice: JSONEncodable {
    public var address: String?
    public var buyerEmail: String?
    public var cancelURL: String?
    public var expireTime: String?
    public var succURL: String?
    public var invoiceID: String?
    public var bitpayInvoiceID: String?
    public var notifyEmail: String?
    public var status: String?
    public var time: String?
    public var fiatCents: String?
    public var satoshis: String?
    public var info: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["address"] = self.address
        nillableDictionary["buyerEmail"] = self.buyerEmail
        nillableDictionary["cancelURL"] = self.cancelURL
        nillableDictionary["expireTime"] = self.expireTime
        nillableDictionary["succURL"] = self.succURL
        nillableDictionary["invoiceID"] = self.invoiceID
        nillableDictionary["bitpayInvoiceID"] = self.bitpayInvoiceID
        nillableDictionary["notifyEmail"] = self.notifyEmail
        nillableDictionary["status"] = self.status
        nillableDictionary["time"] = self.time
        nillableDictionary["fiatCents"] = self.fiatCents
        nillableDictionary["satoshis"] = self.satoshis
        nillableDictionary["info"] = self.info
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
