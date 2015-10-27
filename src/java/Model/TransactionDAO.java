package Model;

import java.util.LinkedList;

/**
 * This interface represents a contract for a DAO for the {@link Transaction} model.
 * Note that all methods which returns the {@link Transaction} from the DB, 
 * will not fill the model with the password, due to security reasons.
 *
 * @author Irini
 */
public interface TransactionDAO {
    
    /**
     * Returns the transaction from the database matching the given ID, otherwise null.
     * @param id The ID of the transaction to be returned.
     * @return The transaction from the database matching the given ID, otherwise null.
     */
    public Transaction findTransaction(Long id);

    /**
     * Returns the transaction from the database matching the given sellerId and buyerId, otherwise null.
     * @param sellerId The sellerId of the member to be returned.
     * @param buyerId The buyerId of the member to be returned.
     * @return The transaction from the database matching the given sellerId and buyerId, otherwise null.
     */
    public Transaction findTransaction(Member sellerId, Member buyerId) ;

    /**
     * Returns a list of all transactions from the database made by member ID. 
     * The list is never null and is empty when the database does not contain any transaction for this member.
     * 
     * @return A list of all transactions from the database ordered by memberID.
     */
    public LinkedList<Transaction> showTransactionsList(Member memberId) ;

    /**
     * Create the given transaction in the database. 
     * The transactionID must be null, otherwise it will throw
     * IllegalArgumentException. 
     * After creating, the DAO will set the obtained ID in the given member.
     * @param transactionID The transactionID to be created in the database.
     * @throws IllegalArgumentException If the member ID is not null
     */
    public void createTransaction(Transaction transactionID) throws IllegalArgumentException;

    /**
     * Update the given transaction in the database. 
     * The transaction must not be null, otherwise it will throw
     * IllegalArgumentException. 
     * 
     * @param transaction The transaction to be updated in the database.
     * @throws IllegalArgumentException If the member ID is null.
     */
    public void updateTransaction(Transaction transaction) throws IllegalArgumentException;

    /**
     * Delete the given transaction from the database. 
     * After deleting, the DAO will set the ID of the given
     * transaction to null.
     * @param transaction The transaction to be deleted from the database.
     */
    public void deleteTransaction(Transaction transaction);

    /**
     * Returns true if the given transaction exist in the database.
     * @param transaction The transaction which is to be checked in the database.
     * 
     * @return True if the given transactionID exist in the database.
     */
    public boolean existTransaction(Transaction transactionID);

    /**
     * Change the transaction of the given transactionID. 
     * The transaction ID must not be null, otherwise it will throw
     * IllegalArgumentException.
     * @param transactionID The transaction to change.
     * @throws IllegalArgumentException If the transaction ID is null.
     */
    public void changeTransaction(Transaction transactionID);

    
    
    
}
