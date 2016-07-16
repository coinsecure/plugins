/*
 * SWGWalletAddressData.h
 * 
 * 
 */

#ifndef SWGWalletAddressData_H_
#define SWGWalletAddressData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGWalletAddressData: public SWGObject {
public:
    SWGWalletAddressData();
    SWGWalletAddressData(QString* json);
    virtual ~SWGWalletAddressData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGWalletAddressData* fromJson(QString &jsonString);

    QString* getWalletID();
    void setWalletID(QString* walletID);
QString* getAddress();
    void setAddress(QString* address);
qint64 getTime();
    void setTime(qint64 time);
QString* getInfo();
    void setInfo(QString* info);
qint32 getMinConf();
    void setMinConf(qint32 minConf);
QString* getNetki();
    void setNetki(QString* netki);

private:
    QString* walletID;
QString* address;
qint64 time;
QString* info;
qint32 minConf;
QString* netki;
};

} /* namespace Swagger */

#endif /* SWGWalletAddressData_H_ */
