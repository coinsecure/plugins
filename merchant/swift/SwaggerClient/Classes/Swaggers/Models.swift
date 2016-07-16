// Models.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation

protocol JSONEncodable {
    func encodeToJSON() -> AnyObject
}

public class Response<T> {
    public let statusCode: Int
    public let header: [String: String]
    public let body: T

    public init(statusCode: Int, header: [String: String], body: T) {
        self.statusCode = statusCode
        self.header = header
        self.body = body
    }

    public convenience init(response: NSHTTPURLResponse, body: T) {
        let rawHeader = response.allHeaderFields
        var header = [String:String]()
        for (key, value) in rawHeader {
            header[key as! String] = value as? String
        }
        self.init(statusCode: response.statusCode, header: header, body: body)
    }
}

private var once = dispatch_once_t()
class Decoders {
    static private var decoders = Dictionary<String, ((AnyObject) -> AnyObject)>()
    
    static func addDecoder<T>(clazz clazz: T.Type, decoder: ((AnyObject) -> T)) {
        let key = "\(T.self)"
        decoders[key] = { decoder($0) as! AnyObject }
    }
    
    static func decode<T>(clazz clazz: [T].Type, source: AnyObject) -> [T] {
        let array = source as! [AnyObject]
        return array.map { Decoders.decode(clazz: T.self, source: $0) }
    }
    
    static func decode<T, Key: Hashable>(clazz clazz: [Key:T].Type, source: AnyObject) -> [Key:T] {
        let sourceDictionary = source as! [Key: AnyObject]
        var dictionary = [Key:T]()
        for (key, value) in sourceDictionary {
            dictionary[key] = Decoders.decode(clazz: T.self, source: value)
        }
        return dictionary
    }
    
    static func decode<T>(clazz clazz: T.Type, source: AnyObject) -> T {
        initialize()
        if T.self is Int32.Type && source is NSNumber {
            return source.intValue as! T;
        }
        if T.self is Int64.Type && source is NSNumber {
            return source.longLongValue as! T;
        }
        if source is T {
            return source as! T
        }
        
        let key = "\(T.self)"
        if let decoder = decoders[key] {
           return decoder(source) as! T
        } else {
            fatalError("Source \(source) is not convertible to type \(clazz): Maybe swagger file is insufficient")
        }
    }

    static func decodeOptional<T>(clazz clazz: T.Type, source: AnyObject?) -> T? {
        if source is NSNull {
            return nil
        }
        return source.map { (source: AnyObject) -> T in
            Decoders.decode(clazz: clazz, source: source)
        }
    }

    static func decodeOptional<T>(clazz clazz: [T].Type, source: AnyObject?) -> [T]? {
        if source is NSNull {
            return nil
        }
        return source.map { (someSource: AnyObject) -> [T] in
            Decoders.decode(clazz: clazz, source: someSource)
        }
    }

    static func decodeOptional<T, Key: Hashable>(clazz clazz: [Key:T].Type, source: AnyObject?) -> [Key:T]? {
        if source is NSNull {
            return nil
        }
        return source.map { (someSource: AnyObject) -> [Key:T] in
            Decoders.decode(clazz: clazz, source: someSource)
        }
    }
	
    static private func initialize() {
        dispatch_once(&once) {
            let formatters = [
                "yyyy-MM-dd",
                "yyyy-MM-dd'T'HH:mm:ssZZZZZ",
                "yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ",
                "yyyy-MM-dd'T'HH:mm:ss'Z'"
            ].map { (format: String) -> NSDateFormatter in
                let formatter = NSDateFormatter()
                formatter.dateFormat = format
                return formatter
            }
            // Decoder for NSDate
            Decoders.addDecoder(clazz: NSDate.self) { (source: AnyObject) -> NSDate in
               if let sourceString = source as? String {
                    for formatter in formatters {
                        if let date = formatter.dateFromString(sourceString) {
                            return date
                        }
                    }
                
                }
                if let sourceInt = source as? Int {
                    // treat as a java date
                    return NSDate(timeIntervalSince1970: Double(sourceInt / 1000) )
                }
                fatalError("formatter failed to parse \(source)")
            } 

            // Decoder for [ActionAnyContent]
            Decoders.addDecoder(clazz: [ActionAnyContent].self) { (source: AnyObject) -> [ActionAnyContent] in
                return Decoders.decode(clazz: [ActionAnyContent].self, source: source)
            }
            // Decoder for ActionAnyContent
            Decoders.addDecoder(clazz: ActionAnyContent.self) { (source: AnyObject) -> ActionAnyContent in
                let sourceDictionary = source as! [NSObject:AnyObject]
                let instance = ActionAnyContent()
                return instance
            }


            // Decoder for [FailInvoice]
            Decoders.addDecoder(clazz: [FailInvoice].self) { (source: AnyObject) -> [FailInvoice] in
                return Decoders.decode(clazz: [FailInvoice].self, source: source)
            }
            // Decoder for FailInvoice
            Decoders.addDecoder(clazz: FailInvoice.self) { (source: AnyObject) -> FailInvoice in
                let sourceDictionary = source as! [NSObject:AnyObject]
                let instance = FailInvoice()
                instance.success = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["success"])
                instance.message = Decoders.decodeOptional(clazz: JsValue.self, source: sourceDictionary["message"])
                instance.time = Decoders.decodeOptional(clazz: NSDate.self, source: sourceDictionary["time"])
                instance.method = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["method"])
                instance.title = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["title"])
                return instance
            }


            // Decoder for [FailMerchant]
            Decoders.addDecoder(clazz: [FailMerchant].self) { (source: AnyObject) -> [FailMerchant] in
                return Decoders.decode(clazz: [FailMerchant].self, source: source)
            }
            // Decoder for FailMerchant
            Decoders.addDecoder(clazz: FailMerchant.self) { (source: AnyObject) -> FailMerchant in
                let sourceDictionary = source as! [NSObject:AnyObject]
                let instance = FailMerchant()
                instance.success = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["success"])
                instance.message = Decoders.decodeOptional(clazz: JsValue.self, source: sourceDictionary["message"])
                instance.time = Decoders.decodeOptional(clazz: NSDate.self, source: sourceDictionary["time"])
                instance.method = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["method"])
                instance.title = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["title"])
                return instance
            }


            // Decoder for [Invoice]
            Decoders.addDecoder(clazz: [Invoice].self) { (source: AnyObject) -> [Invoice] in
                return Decoders.decode(clazz: [Invoice].self, source: source)
            }
            // Decoder for Invoice
            Decoders.addDecoder(clazz: Invoice.self) { (source: AnyObject) -> Invoice in
                let sourceDictionary = source as! [NSObject:AnyObject]
                let instance = Invoice()
                instance.address = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["address"])
                instance.buyerEmail = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["buyerEmail"])
                instance.cancelURL = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["cancelURL"])
                instance.expireTime = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["expireTime"])
                instance.succURL = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["succURL"])
                instance.invoiceID = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["invoiceID"])
                instance.bitpayInvoiceID = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["bitpayInvoiceID"])
                instance.notifyEmail = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["notifyEmail"])
                instance.status = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["status"])
                instance.time = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["time"])
                instance.fiatCents = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["fiatCents"])
                instance.satoshis = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["satoshis"])
                instance.info = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["info"])
                return instance
            }


            // Decoder for [InvoiceIDFull]
            Decoders.addDecoder(clazz: [InvoiceIDFull].self) { (source: AnyObject) -> [InvoiceIDFull] in
                return Decoders.decode(clazz: [InvoiceIDFull].self, source: source)
            }
            // Decoder for InvoiceIDFull
            Decoders.addDecoder(clazz: InvoiceIDFull.self) { (source: AnyObject) -> InvoiceIDFull in
                let sourceDictionary = source as! [NSObject:AnyObject]
                let instance = InvoiceIDFull()
                instance.from = Decoders.decodeOptional(clazz: Int64.self, source: sourceDictionary["from"])
                instance.to = Decoders.decodeOptional(clazz: Int64.self, source: sourceDictionary["to"])
                instance.max = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["max"])
                instance.offset = Decoders.decodeOptional(clazz: Int64.self, source: sourceDictionary["offset"])
                return instance
            }


            // Decoder for [JsValue]
            Decoders.addDecoder(clazz: [JsValue].self) { (source: AnyObject) -> [JsValue] in
                return Decoders.decode(clazz: [JsValue].self, source: source)
            }
            // Decoder for JsValue
            Decoders.addDecoder(clazz: JsValue.self) { (source: AnyObject) -> JsValue in
                let sourceDictionary = source as! [NSObject:AnyObject]
                let instance = JsValue()
                return instance
            }


            // Decoder for [Merchant]
            Decoders.addDecoder(clazz: [Merchant].self) { (source: AnyObject) -> [Merchant] in
                return Decoders.decode(clazz: [Merchant].self, source: source)
            }
            // Decoder for Merchant
            Decoders.addDecoder(clazz: Merchant.self) { (source: AnyObject) -> Merchant in
                let sourceDictionary = source as! [NSObject:AnyObject]
                let instance = Merchant()
                instance.firstName = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["firstName"])
                instance.lastName = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["lastName"])
                instance.coinBalance = Decoders.decodeOptional(clazz: Int64.self, source: sourceDictionary["coinBalance"])
                instance.fiatBalance = Decoders.decodeOptional(clazz: Int64.self, source: sourceDictionary["fiatBalance"])
                instance.merchantType = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["merchantType"])
                instance.organization = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["organization"])
                instance.status = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["status"])
                instance.website = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["website"])
                instance.address = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["address"])
                instance.adminEmail = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["adminEmail"])
                instance.businessType = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["businessType"])
                instance.info = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["info"])
                instance.minCoinSettlement = Decoders.decodeOptional(clazz: Int64.self, source: sourceDictionary["minCoinSettlement"])
                instance.minFiatSettlement = Decoders.decodeOptional(clazz: Int64.self, source: sourceDictionary["minFiatSettlement"])
                instance.tel = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["tel"])
                return instance
            }


            // Decoder for [NewInvoice]
            Decoders.addDecoder(clazz: [NewInvoice].self) { (source: AnyObject) -> [NewInvoice] in
                return Decoders.decode(clazz: [NewInvoice].self, source: source)
            }
            // Decoder for NewInvoice
            Decoders.addDecoder(clazz: NewInvoice.self) { (source: AnyObject) -> NewInvoice in
                let sourceDictionary = source as! [NSObject:AnyObject]
                let instance = NewInvoice()
                instance.orderID = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["orderID"])
                instance.fiat = Decoders.decodeOptional(clazz: Int64.self, source: sourceDictionary["fiat"])
                instance.succURL = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["succURL"])
                instance.cancelURL = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["cancelURL"])
                instance.buyerEmail = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["buyerEmail"])
                instance.notifyEmail = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["notifyEmail"])
                instance.info = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["info"])
                return instance
            }


            // Decoder for [SuccessInvoice]
            Decoders.addDecoder(clazz: [SuccessInvoice].self) { (source: AnyObject) -> [SuccessInvoice] in
                return Decoders.decode(clazz: [SuccessInvoice].self, source: source)
            }
            // Decoder for SuccessInvoice
            Decoders.addDecoder(clazz: SuccessInvoice.self) { (source: AnyObject) -> SuccessInvoice in
                let sourceDictionary = source as! [NSObject:AnyObject]
                let instance = SuccessInvoice()
                instance.success = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["success"])
                instance.message = Decoders.decodeOptional(clazz: Invoice.self, source: sourceDictionary["message"])
                instance.time = Decoders.decodeOptional(clazz: NSDate.self, source: sourceDictionary["time"])
                instance.method = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["method"])
                instance.title = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["title"])
                return instance
            }


            // Decoder for [SuccessInvoices]
            Decoders.addDecoder(clazz: [SuccessInvoices].self) { (source: AnyObject) -> [SuccessInvoices] in
                return Decoders.decode(clazz: [SuccessInvoices].self, source: source)
            }
            // Decoder for SuccessInvoices
            Decoders.addDecoder(clazz: SuccessInvoices.self) { (source: AnyObject) -> SuccessInvoices in
                let sourceDictionary = source as! [NSObject:AnyObject]
                let instance = SuccessInvoices()
                instance.success = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["success"])
                instance.message = Decoders.decodeOptional(clazz: Array.self, source: sourceDictionary["message"])
                instance.time = Decoders.decodeOptional(clazz: NSDate.self, source: sourceDictionary["time"])
                instance.method = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["method"])
                instance.title = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["title"])
                return instance
            }


            // Decoder for [SuccessMerchant]
            Decoders.addDecoder(clazz: [SuccessMerchant].self) { (source: AnyObject) -> [SuccessMerchant] in
                return Decoders.decode(clazz: [SuccessMerchant].self, source: source)
            }
            // Decoder for SuccessMerchant
            Decoders.addDecoder(clazz: SuccessMerchant.self) { (source: AnyObject) -> SuccessMerchant in
                let sourceDictionary = source as! [NSObject:AnyObject]
                let instance = SuccessMerchant()
                instance.success = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["success"])
                instance.message = Decoders.decodeOptional(clazz: Merchant.self, source: sourceDictionary["message"])
                instance.time = Decoders.decodeOptional(clazz: NSDate.self, source: sourceDictionary["time"])
                instance.method = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["method"])
                instance.title = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["title"])
                return instance
            }
        }
    }
}