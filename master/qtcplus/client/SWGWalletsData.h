/*
 * SWGWalletsData.h
 * 
 * 
 */

#ifndef SWGWalletsData_H_
#define SWGWalletsData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGWalletsData: public SWGObject {
public:
    SWGWalletsData();
    SWGWalletsData(QString* json);
    virtual ~SWGWalletsData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGWalletsData* fromJson(QString &jsonString);

    QString* getWalletID();
    void setWalletID(QString* walletID);
QString* getName();
    void setName(QString* name);
qint64 getCoinBalance();
    void setCoinBalance(qint64 coinBalance);
qint64 getTime();
    void setTime(qint64 time);
QString* getInfo();
    void setInfo(QString* info);
QString* getNetki();
    void setNetki(QString* netki);

private:
    QString* walletID;
QString* name;
qint64 coinBalance;
qint64 time;
QString* info;
QString* netki;
};

} /* namespace Swagger */

#endif /* SWGWalletsData_H_ */
