/*
 * SWGKYCData.h
 * 
 * 
 */

#ifndef SWGKYCData_H_
#define SWGKYCData_H_

#include <QJsonObject>


#include "SWGTimeKYCData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGKYCData: public SWGObject {
public:
    SWGKYCData();
    SWGKYCData(QString* json);
    virtual ~SWGKYCData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGKYCData* fromJson(QString &jsonString);

    SWGTimeKYCData* getTimeDetails();
    void setTimeDetails(SWGTimeKYCData* timeDetails);
QString* getKycID();
    void setKycID(QString* kycID);
QString* getFirstName();
    void setFirstName(QString* firstName);
QString* getLastName();
    void setLastName(QString* lastName);
QString* getStatus();
    void setStatus(QString* status);
QString* getUserType();
    void setUserType(QString* userType);
QString* getInfo();
    void setInfo(QString* info);

private:
    SWGTimeKYCData* timeDetails;
QString* kycID;
QString* firstName;
QString* lastName;
QString* status;
QString* userType;
QString* info;
};

} /* namespace Swagger */

#endif /* SWGKYCData_H_ */
